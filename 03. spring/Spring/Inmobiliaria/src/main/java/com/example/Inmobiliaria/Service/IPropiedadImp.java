package com.example.Inmobiliaria.Service;

import com.example.Inmobiliaria.DTO.HabitacionesDTO;
import com.example.Inmobiliaria.DTO.PropiedadDTO;

import java.util.Map;

public interface IPropiedadImp {

    Double calcularMetrosCuadrados(PropiedadDTO propiedad);
    Double calcularValorPropiedad(PropiedadDTO propiedad);

    HabitacionesDTO habitacionMasGrande(PropiedadDTO propiedad);

    Map<String, Double> calcularMetrosCuadradosPorHabitacion(PropiedadDTO propiedades);
}