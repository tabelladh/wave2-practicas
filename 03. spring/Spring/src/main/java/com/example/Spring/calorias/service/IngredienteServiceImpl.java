package com.example.Spring.calorias.service;

import com.example.Spring.calorias.dto.request.IngredienteConPesoDTO;
import com.example.Spring.calorias.dto.request.PlatoDTO;
import com.example.Spring.calorias.dto.response.IngredientePorCaloriasYPesoDTO;
import com.example.Spring.calorias.dto.response.RespuestaDTO;
import com.example.Spring.calorias.exception.PesoNonExistException;
import com.example.Spring.calorias.model.Ingrediente;
import com.example.Spring.calorias.repository.IngredientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.example.Spring.calorias.exception.IngredienteNonExistException;
import org.springframework.util.StringUtils;

@Service
public class IngredienteServiceImpl implements IngredienteService{

   @Autowired
   private IngredientesRepository ingredienteRepository;

   public List<Ingrediente> obtenerIngredientes() {
      return ingredienteRepository.findAll();
   }

   private Ingrediente obtenerIngredientes(String name) {
      return ingredienteRepository.findAll()
            .stream()
            .filter(ingrediente -> ingrediente.getName().equals(name))
            .findFirst()
            .orElseThrow(IngredienteNonExistException::new);
   }

   @Override
   public RespuestaDTO retornarCaloriasTotales(PlatoDTO platoDTO) {
      int caloriasTotales = platoDTO.getIngredientes()
            .stream()
            .mapToInt(ingredienteConPesoDTO -> {
               int peso = ingredienteConPesoDTO.getWeight();
               int caloriasPorCada100Gramos = obtenerIngredientes(ingredienteConPesoDTO.getName()).getCalories();
               return ingredienteConPesoDTO.getWeight() * obtenerIngredientes(ingredienteConPesoDTO.getName()).getCalories() / 100;
            })
            .sum();
      return new RespuestaDTO("Las calorias totales del plato son: " + caloriasTotales);
   }

   @Override
   public List<IngredientePorCaloriasYPesoDTO> retornarCaloriasPorIngrediente(PlatoDTO platoDTO) {
      List<IngredientePorCaloriasYPesoDTO> caloriasPorIngrediente = new ArrayList<>();
      for (IngredienteConPesoDTO ingredienteConPesoDTO : platoDTO.getIngredientes()) {
         Integer peso = ingredienteConPesoDTO.getWeight();
         if (peso == null || peso == 0 || StringUtils.isEmpty(ingredienteConPesoDTO.getWeight().toString())) {
            throw new PesoNonExistException();
         }
         Ingrediente ingrediente = obtenerIngredientes(ingredienteConPesoDTO.getName());
         double calorias = (ingrediente.getCalories() * peso) / 100.0;
         caloriasPorIngrediente.add(new IngredientePorCaloriasYPesoDTO(ingrediente.getName(), (int) calorias, peso));
      }
      return caloriasPorIngrediente;
   }

   @Override
   public RespuestaDTO encontrarIngredienteConMasCalorias(PlatoDTO platoDTO) {
      IngredientePorCaloriasYPesoDTO ingredienteConMasCalorias = null;
      double maxCalorias = Double.MIN_VALUE;
      for (IngredienteConPesoDTO ingredienteConPesoDTO : platoDTO.getIngredientes()) {
         Ingrediente ingrediente = obtenerIngredientes(ingredienteConPesoDTO.getName());
         double calorias = (ingrediente.getCalories() * ingredienteConPesoDTO.getWeight()) / 100.0;
         if (calorias > maxCalorias) {
            maxCalorias = calorias;
            ingredienteConMasCalorias = new IngredientePorCaloriasYPesoDTO(ingrediente.getName(), ingrediente.getCalories(), ingredienteConPesoDTO.getWeight());
         }
      }
      return new RespuestaDTO("El ingrediente con más calorías es: " + ingredienteConMasCalorias.getName() + " con " + maxCalorias + " calorías.");
   }
}