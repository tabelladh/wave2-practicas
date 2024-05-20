package com.example.calorias.service;

import com.example.calorias.dto.req.IngredientePesoDto;
import com.example.calorias.dto.req.PlatoDto;
import com.example.calorias.dto.res.IngredienteCaloriaDto;
import com.example.calorias.dto.res.RespuestaDto;
import com.example.calorias.model.Ingrediente;
import com.example.calorias.model.Plato;

import java.util.List;

public interface IngredientService {

    List<Ingrediente> findAllIngredints();
    RespuestaDto getCaloriesByDish(PlatoDto platoDto);
    IngredienteCaloriaDto getCaloriesForIngredient(PlatoDto platoDto);
    RespuestaDto getMaximum(PlatoDto platoDto);
}
