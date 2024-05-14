package com.example.Calorias.Service;

import com.example.Calorias.DTO.Ingrediente;
import com.example.Calorias.DTO.Plato;

import java.util.List;

public interface CalculadoraCaloriasService {
    double calcularCaloriasTotales(Plato plato);
    double calcularCaloriasPorIngrediente(Ingrediente ingrediente);
    Ingrediente encontrarIngredienteMasCalorico(List<Ingrediente> ingredientes);
    List<Double> calcularCaloriasPorPlato(List<Plato> platos);
}


