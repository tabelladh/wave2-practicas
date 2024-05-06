package com.example.demo.Model;

import lombok.Data;

import java.util.List;

@Data
public class Propiedad
{

    private String nombrePropiedad;
    private String direccionPropiedad;
    private List<Habitacion> habitaciones;


}
