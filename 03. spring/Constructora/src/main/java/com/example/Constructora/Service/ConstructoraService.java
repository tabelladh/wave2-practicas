package com.example.Constructora.Service;

import com.example.Constructora.DTO.HabitacionDTO;
import com.example.Constructora.Model.Habitacion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConstructoraService implements IConstructoraService {

    @Override
    public Double areaHab(List<Habitacion> habitacionList) {
        double totalPropiedad = 0.0;
        for (Habitacion hab : habitacionList) {
            totalPropiedad += (hab.getAncho() * hab.getLargo());

        }
        return totalPropiedad;
    }

    @Override
    public Double valorPropiedad(List<Habitacion> habitacionList) {
        double precioTotal = 0;
        for (Habitacion hab : habitacionList) {
            double areaHab = hab.getAncho() * hab.getLargo();
            precioTotal += areaHab * 800;
        }
        return precioTotal;
    }

    @Override
    public HabitacionDTO habGrande(List<Habitacion> habitacionList) {
        double maxArea = 0.0;
        HabitacionDTO habGrande = null;
        for (Habitacion hab : habitacionList) {
            double area = hab.getAncho() * hab.getLargo();
            if (area > maxArea) {
                maxArea = area;
                habGrande = new HabitacionDTO(hab.getNombre(), area);
            }
        }
        return habGrande;
    }

    @Override
    public List<HabitacionDTO> areaPorHabitacion(List<Habitacion> habitacionList) {
        List<HabitacionDTO> areaHabitacionesDTO = new ArrayList<>();
        for (Habitacion hab : habitacionList) {
            double areaPorHabitacion = hab.getAncho() * hab.getLargo();
            HabitacionDTO areaDeLaHabitacion = new HabitacionDTO(hab.getNombre(), areaPorHabitacion);
            areaHabitacionesDTO.add(areaDeLaHabitacion);
        }
        return areaHabitacionesDTO;
    }

//    @Override
//    public HabitacionesDTO getHabGrande(HabitacionesDTO habitacionesDTO) {
//        HabitacionesDTO habGrande = null;
//        double maxArea = Double.MIN_VALUE;
//
//        for (HabitacionesDTO hab : HabitacionesDTO() {
//            double area = areaHab(hab);
//            if (area > maxArea) {
//                maxArea = area;
//                habGrande = hab;
//            }
//        }
//        return habGrande;
//    }
//    public List<HabitacionesDTO> getHabitaciones() {
//        return getHabitaciones();
//    }

}
