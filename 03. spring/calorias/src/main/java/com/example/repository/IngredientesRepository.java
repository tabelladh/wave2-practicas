package com.example.repository;

import com.example.model.Ingrediente;
import java.util.List;

public interface IngredientesRepository {
   List<Ingrediente> findAll();
}
