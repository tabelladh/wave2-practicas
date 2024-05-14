package com.example.Calorias.Service;

import com.example.Calorias.DTO.Ingrediente;
import com.example.Calorias.DTO.Plato;
import org.springframework.stereotype.Service;
import com.example.Calorias.Util.JsonReader;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalculadoraCaloriasServiceImpl implements CalculadoraCaloriasService {
    @Override
    public double calcularCaloriasTotales(Plato plato) {
        return plato.getIngredientes().stream()
                .mapToDouble(this::calcularCaloriasPorIngrediente)
                .sum();
    }

    @Override
    public double calcularCaloriasPorIngrediente(Ingrediente ingrediente) {
        return ingrediente.getPeso() * ingrediente.getCalorias();
    }

    public Ingrediente encontrarIngredienteMasCalorico(List<Ingrediente> ingrediente) {
        return ingrediente.stream().max(Comparator.comparingDouble(Ingrediente::getCalorias)).get();
    }

    @Override
    public List<Double> calcularCaloriasPorPlato(List<Plato> platos) {
        return platos.stream()
                .map(this::calcularCaloriasTotales)
                .collect(Collectors.toList());
    }
}

