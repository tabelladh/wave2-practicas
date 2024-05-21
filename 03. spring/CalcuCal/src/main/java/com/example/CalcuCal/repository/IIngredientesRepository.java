package com.example.CalcuCal.repository;

import com.example.CalcuCal.model.Ingrediente;

import java.util.List;

public interface IIngredientesRepository {
    List<Ingrediente> findAll();

}
