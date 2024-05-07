package com.example.demoMetrosCuadrados.service;

import com.example.demoMetrosCuadrados.dto.PropiedadDTO;
import com.example.demoMetrosCuadrados.dto.RespuestaDTO;

public interface IPropiedadService {

    RespuestaDTO calcularTotalM2Propiedad (PropiedadDTO propiedad);

    RespuestaDTO calcularCostoTotalPropiedad (PropiedadDTO propiedad, Double valorM2);


    RespuestaDTO retornarHabitacionMasGrande(PropiedadDTO propiedad);

    RespuestaDTO retornarm2Habitacion(PropiedadDTO propiedadDTO);

}
