package com.example.CalcuCal.service;

import com.example.CalcuCal.dto.request.IngredienteConPesoDTO;
import com.example.CalcuCal.dto.request.PlatoDTO;
import com.example.CalcuCal.dto.response.RespuestaDTO;
import com.example.CalcuCal.exception.IngredienteNonExistException;
import com.example.CalcuCal.model.Ingrediente;
import com.example.CalcuCal.repository.IIngredientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredienteServiceImpl implements IIngredienteService{

    @Autowired
    private IIngredientesRepository ingredienteRepository;

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




}
