package com.example.CalcuCalorias.service;

import com.example.CalcuCalorias.dto.request.PlatoDTO;
import com.example.CalcuCalorias.dto.response.IngredientesPorCaloriasYPesoDTO;
import com.example.CalcuCalorias.dto.response.RespuestaDTO;
import com.example.CalcuCalorias.model.Ingrediente;
import com.example.CalcuCalorias.repository.IIngredientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IngredientesService implements IIngredientesService {

    @Autowired
    private IIngredientesRepository ingredientesRepository;


    @Override
    public List<Ingrediente> obtenerIngredientes() {
        return ingredientesRepository.findAll(); // name y calories x ingrediente q esta en una list
    }

    public RespuestaDTO retornarCaloriasTotales(PlatoDTO platoDTO) {

        int caloriasTotales = platoDTO.getIngredientes()
                .stream()
                .mapToInt(ingredienteConPesoDTO -> {
                    int peso = ingredienteConPesoDTO.getWeight();
                    int caloriasPorCada100Gramos = obtenerIngredientes(ingredienteConPesoDTO.getName()).getCalories();
                    return peso * caloriasPorCada100Gramos / 100;
                })
                .sum();

        return new RespuestaDTO("Las calorias totales del plato son: " + caloriasTotales);
    }

    @Override
    public List<IngredientesPorCaloriasYPesoDTO> retornarCaloriasTotalesPorIngrediente(PlatoDTO platoDTO) {
        List<IngredientesPorCaloriasYPesoDTO> ingredientesPorCaloriasYPesoDTOList;

        ingredientesPorCaloriasYPesoDTOList = platoDTO.getIngredientes().stream()
                .map( ingredienteConPesoDTO -> new IngredientesPorCaloriasYPesoDTO( //Cargando datos al DTO que necesito
                        ingredienteConPesoDTO.getName(),
                        ingredienteConPesoDTO.getWeight(),
                        obtenerIngredientes(ingredienteConPesoDTO.getName()).getCalories()*ingredienteConPesoDTO.getWeight()/100
                ))
                .toList();

        return ingredientesPorCaloriasYPesoDTOList;
    }

    @Override
    public RespuestaDTO retornarIngredienteConMasCalorias(PlatoDTO platoDTO) {
        int maxCalorias = platoDTO.getIngredientes().stream()
                .mapToInt(ingredienteConPesoDTO ->
                obtenerIngredientes(ingredienteConPesoDTO.getName()).getCalories()*ingredienteConPesoDTO.getWeight()/100)
                .max()
                .orElse(0);

        String maxNombreIngrediente = platoDTO.getIngredientes().stream()
                .filter(valor ->
                        obtenerIngredientes(valor.getName()).getCalories()*valor.getWeight()/100 == maxCalorias)
                .findFirst()
                .orElse(null)
                .getName();

        return new RespuestaDTO("El ingrediente con mas calorias es: "
                + maxNombreIngrediente + " con "+ maxCalorias + " calorias.");

    }

    private Ingrediente obtenerIngredientes(String name) {

        return ingredientesRepository.findAll()
                .stream()
                .filter(ingrediente -> ingrediente.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

}
