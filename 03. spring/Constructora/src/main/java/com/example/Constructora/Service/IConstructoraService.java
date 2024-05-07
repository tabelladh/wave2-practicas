package com.example.Constructora.Service;

import com.example.Constructora.DTO.HabitacionDTO;
import com.example.Constructora.Model.Habitacion;

import java.util.List;


public interface IConstructoraService {

   Double areaHab(List<Habitacion> habitacionList);
   Double valorPropiedad(List<Habitacion> habitacionList);
   HabitacionDTO habGrande(List<Habitacion> habitacionList);
   List<HabitacionDTO> areaPorHabitacion(List<Habitacion> habitacionList);

}
