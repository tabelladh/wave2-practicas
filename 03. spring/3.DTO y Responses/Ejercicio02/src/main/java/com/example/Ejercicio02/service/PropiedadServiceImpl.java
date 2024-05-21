package com.example.Ejercicio02.service;


import com.example.Ejercicio02.DTO.HabitacionDTO;
import com.example.Ejercicio02.Model.Habitacion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PropiedadServiceImpl implements IPropiedadService{
    @Override
    public Double totalMetrosCuadrados(List<Habitacion> habitacionList) {
        Double cantTotalMtsCuadrados = 0.0;
        for (Habitacion habitacion : habitacionList) {
            cantTotalMtsCuadrados = cantTotalMtsCuadrados + (habitacion.getAncho() * habitacion.getLargo());
        }

        return cantTotalMtsCuadrados;
    }

    @Override
    public Double precioTotalPropiedad(List<Habitacion> habitacionList) {
        Double precioTotal = totalMetrosCuadrados(habitacionList) * 800.0;

        return precioTotal;
    }

    @Override
    public Habitacion habitacionMasGrande(List<Habitacion> habitacionList) {
        Double totalMetrosCuadrados = 0.0;
        Habitacion habitacionMasGrande = null;
        Double totalActual = 0.0;

        for (Habitacion habitacion : habitacionList) {
            totalMetrosCuadrados = (habitacion.getAncho() * habitacion.getLargo());
            if (totalMetrosCuadrados >= totalActual) {
                totalActual = totalMetrosCuadrados;
                habitacionMasGrande = habitacion;
            }
        }

        return habitacionMasGrande;
    }

    @Override
    public List<Double> metrosCuadradosPorHabitacion(List<Habitacion> habitacionList) {
        List<Double> result = new ArrayList<>();
        for (Habitacion habitacion : habitacionList) {
            result.add(habitacion.getAncho() + habitacion.getLargo());
        }
        return result;
    }
}
