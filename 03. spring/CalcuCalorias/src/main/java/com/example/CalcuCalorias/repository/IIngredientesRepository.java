package com.example.CalcuCalorias.repository;

import com.example.CalcuCalorias.model.Ingrediente;

import java.util.List;

public interface IIngredientesRepository {

    List<Ingrediente> findAll();

}
