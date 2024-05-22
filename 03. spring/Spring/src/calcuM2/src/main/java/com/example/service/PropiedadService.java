package com.example.service;

import com.example.model.Habitacion;
import com.example.model.Propiedad;
import java.util.Map;

public interface PropiedadService {
    double calcularArea(Propiedad propiedad);
    double calcularValor(Propiedad propiedad);
    Habitacion habMasGrande(Propiedad propiedad);
    Map<String, Double> calcularAreaPorHabitacion(Propiedad propiedad);
}
