package com.example.Spring.calcuM2.service.service;

import com.example.Spring.calcuM2.service.model.Habitacion;
import com.example.Spring.calcuM2.service.model.Propiedad;
import java.util.Map;

public interface PropiedadService {
    double calcularArea(Propiedad propiedad);
    double calcularValor(Propiedad propiedad);
    Habitacion habMasGrande(Propiedad propiedad);
    Map<String, Double> calcularAreaPorHabitacion(Propiedad propiedad);
}
