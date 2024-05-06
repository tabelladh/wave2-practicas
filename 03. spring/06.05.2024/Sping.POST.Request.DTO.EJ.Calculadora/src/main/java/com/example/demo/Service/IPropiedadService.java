package com.example.demo.Service;


import com.example.demo.DTO.PropiedadDTO;
import com.example.demo.DTO.RespuestaDTO;
import com.example.demo.Model.Habitacion;
import com.example.demo.Model.Propiedad;

public interface IPropiedadService {

RespuestaDTO calcularTotalM2Propiedad (PropiedadDTO propiedad);

RespuestaDTO calcularCostoTotalPropiedad (PropiedadDTO propiedad, Double valorM2);


RespuestaDTO retornarHabitacionMasGrande(PropiedadDTO propiedad);

RespuestaDTO retornarm2Habitacion(PropiedadDTO propiedadDTO);

}
