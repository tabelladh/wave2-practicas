package com.example.PropiedadInmobiliaria.service;

import com.example.PropiedadInmobiliaria.DTO.HabitacionDTO;
import com.example.PropiedadInmobiliaria.model.PropiedadInmobiliaria;

import java.util.Map;

public interface PropiedadInmobiliariaService {

    double calcularMetrosCuadradosTotal(PropiedadInmobiliaria propiedad);
    double calcularValorPropiedad(PropiedadInmobiliaria propiedad);
    HabitacionDTO encontrarHabitacionMasGrande(PropiedadInmobiliaria propiedad);
    Map<String, Double> calcularMetrosCuadradosPorHabitacion(PropiedadInmobiliaria propiedad);
}

