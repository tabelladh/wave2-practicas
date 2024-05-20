package com.example.calorias.repository;

import com.example.calorias.model.Ingrediente;
import com.example.calorias.model.Plato;

import java.util.List;

public interface IngredienteRepository {
    List<Ingrediente> findAll();
}
