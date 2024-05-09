package com.example.PropiedadInmobiliaria.service;

import java.util.HashMap;
import java.util.Map;

import com.example.PropiedadInmobiliaria.DTO.HabitacionDTO;
import com.example.PropiedadInmobiliaria.model.Habitacion;
import com.example.PropiedadInmobiliaria.model.PropiedadInmobiliaria;
import org.springframework.stereotype.Service;

@Service
public class PropiedadInmobiliariaServiceImpl implements PropiedadInmobiliariaService {
    @Override
    public double calcularMetrosCuadradosTotal(PropiedadInmobiliaria propiedad) {
        double totalMetrosCuadrados = 0;
        for (Habitacion habitacion : propiedad.getHabitaciones()) {
            totalMetrosCuadrados += habitacion.getAncho() * habitacion.getLargo();
        }
        return totalMetrosCuadrados;
    }

    @Override
    public double calcularValorPropiedad(PropiedadInmobiliaria propiedad) {
        return calcularMetrosCuadradosTotal(propiedad) * 800; // 800 USD por metro cuadrado
    }

    @Override
    public HabitacionDTO encontrarHabitacionMasGrande(PropiedadInmobiliaria propiedad) {
        Habitacion habitacionMasGrande = null;
        double areaMasGrande = 0;
        for (Habitacion habitacion : propiedad.getHabitaciones()) {
            double areaHabitacion = habitacion.getAncho() * habitacion.getLargo();
            if (areaHabitacion > areaMasGrande) {
                areaMasGrande = areaHabitacion;
                habitacionMasGrande = habitacion;
            }
        }
        return convertirAHabitacionDTO(habitacionMasGrande);
    }

    @Override
    public Map<String, Double> calcularMetrosCuadradosPorHabitacion(PropiedadInmobiliaria propiedad) {
        Map<String, Double> metrosCuadradosPorHabitacion = new HashMap<>();
        for (Habitacion habitacion : propiedad.getHabitaciones()) {
            double areaHabitacion = habitacion.getAncho() * habitacion.getLargo();
            metrosCuadradosPorHabitacion.put(habitacion.getNombre(), areaHabitacion);
        }
        return metrosCuadradosPorHabitacion;
    }

    private HabitacionDTO convertirAHabitacionDTO(Habitacion habitacion) {
        HabitacionDTO habitacionDTO = new HabitacionDTO();
        habitacionDTO.setNombre(habitacion.getNombre());
        habitacionDTO.setAncho(habitacion.getAncho());
        habitacionDTO.setLargo(habitacion.getLargo());
        return habitacionDTO;
    }
}