package com.example.Inmobiliaria.Service;

import com.example.Inmobiliaria.DTO.HabitacionesDTO;
import com.example.Inmobiliaria.DTO.PropiedadDTO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Propiedad implements IPropiedadImp {
    @Override
    public Double calcularMetrosCuadrados(PropiedadDTO propiedad) {
        double metros = 0.0;
        for (HabitacionesDTO habitacion : propiedad.getHabitaciones()) {
            double ancho = habitacion.getAncho();
            double largo = habitacion.getLargo();
            metros = ancho * largo;
        }
        return metros;
    }


    @Override
    public Double calcularValorPropiedad(PropiedadDTO propiedad) {
        double metros = calcularMetrosCuadrados(propiedad);
        double valor = metros * 800;
        return valor;
    }


    @Override
    public HabitacionesDTO habitacionMasGrande(PropiedadDTO propiedad) {
        HabitacionesDTO habitacionMasGrande = null;
        double areaMasGrande = Double.MIN_VALUE;
        for (HabitacionesDTO habitacion : propiedad.getHabitaciones()) {
            double area = habitacion.getAncho() * habitacion.getLargo();
            if (area > areaMasGrande) {
                areaMasGrande = area;
                habitacionMasGrande = habitacion;
            }
        }
        return habitacionMasGrande;
    }

    @Override
    public Map<String, Double> calcularMetrosCuadradosPorHabitacion(PropiedadDTO propiedades) {
        Map<String, Double> metrosCuadradosPorHabitacion = new HashMap<>();
        for (HabitacionesDTO habitacion : propiedades.getHabitaciones()) {
            double area = habitacion.getAncho() * habitacion.getLargo();
            metrosCuadradosPorHabitacion.put(habitacion.getNombre(), area);
        }
        return metrosCuadradosPorHabitacion;
    }
}