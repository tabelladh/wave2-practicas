package com.example.Spring.calorias.repository;

import com.example.Spring.calorias.model.Ingrediente;
import java.util.List;

public interface IngredientesRepository {
   List<Ingrediente> findAll();
}
