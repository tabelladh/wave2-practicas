package com.example.calorias.service;

import com.example.calorias.dto.req.IngredientePesoDto;
import com.example.calorias.dto.req.PlatoDto;
import com.example.calorias.dto.res.IngredienteCaloriaDto;
import com.example.calorias.dto.res.RespuestaDto;
import com.example.calorias.exception.IngredientNotFoundException;
import com.example.calorias.model.Ingrediente;
import com.example.calorias.model.Plato;
import com.example.calorias.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    IngredienteRepository repository;

    private Ingrediente findByName(String name){
        return repository.findAll().stream()
                .filter(n-> n.getName().equals(name))
                .findFirst()
                .orElseThrow(IngredientNotFoundException::new);
    }


    @Override
    public List<Ingrediente> findAllIngredints() {
        return repository.findAll();
    }

    @Override
    public RespuestaDto getCaloriesByDish(PlatoDto platoDto) {

        int caloriasTotales= platoDto.getIngredients().stream()
                .mapToInt(i->{
                    int peso = i.getWeight();
                    int calorias = findByName(i.getName()).getCalories();
                    return (peso * calorias)/100;
                })
                .sum();

        return new RespuestaDto("las calorias del plato son: " + caloriasTotales);
    }

    @Override
    public IngredienteCaloriaDto getCaloriesForIngredient(PlatoDto platoDto) {
        return null;
    }

    @Override
    public RespuestaDto getMaximum(PlatoDto platoDto) {
        return null;
    }
}
