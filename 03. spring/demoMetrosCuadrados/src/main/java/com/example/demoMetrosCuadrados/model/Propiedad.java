package com.example.demoMetrosCuadrados.model;


import lombok.Data;

import java.util.List;

@Data
public class Propiedad
{

    private String nombrePropiedad;
    private String direccionPropiedad;
    private List<Habitacion> habitaciones;


}