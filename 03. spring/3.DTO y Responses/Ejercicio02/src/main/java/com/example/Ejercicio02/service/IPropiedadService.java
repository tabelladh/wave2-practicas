package com.example.Ejercicio02.service;

import com.example.Ejercicio02.DTO.HabitacionDTO;
import com.example.Ejercicio02.Model.Habitacion;

import java.util.List;

public interface IPropiedadService {

    Double totalMetrosCuadrados (List<Habitacion> habitacionList);

    Double precioTotalPropiedad (List<Habitacion> habitacionList);

    Habitacion habitacionMasGrande (List<Habitacion> habitacionList);

    List<Double> metrosCuadradosPorHabitacion (List<Habitacion> habitacionList);

}
