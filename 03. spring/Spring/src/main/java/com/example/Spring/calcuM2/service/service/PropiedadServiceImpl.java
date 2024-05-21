package com.example.Spring.calcuM2.service.service;

import com.example.Spring.calcuM2.service.model.Habitacion;
import com.example.Spring.calcuM2.service.model.Propiedad;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class PropiedadServiceImpl implements PropiedadService {

    @Override
    public double calcularArea(Propiedad propiedad) {
        double totalArea = 0;
        for (Habitacion hab : propiedad.getHabitaciones()) {
            totalArea += hab.getAncho() * hab.getLargo();
        }
        return totalArea;
    }

    @Override
    public double calcularValor(Propiedad propiedad) {
        double totalArea = calcularArea(propiedad);
        return totalArea * 800;
    }

    @Override
    public Habitacion habMasGrande(Propiedad propiedad) {
        Habitacion masGrande = null;
        double maxArea = Double.MIN_VALUE;
        for (Habitacion hab : propiedad.getHabitaciones()) {
            double area = hab.getAncho() * hab.getLargo();
            if (area > maxArea) {
                maxArea = area;
                masGrande = hab;
            }
        }
        return masGrande;
    }

    @Override
    public Map<String, Double> calcularAreaPorHabitacion(Propiedad propiedad) {
        Map<String, Double> areaPorHab = new HashMap<>();
        for (Habitacion hab : propiedad.getHabitaciones()) {
            double area = hab.getAncho() * hab.getLargo();
            areaPorHab.put(hab.getNombre(), area);
        }
        return areaPorHab;
    }
}

