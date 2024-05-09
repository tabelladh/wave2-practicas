package com.example.PropiedadInmobiliaria.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Habitacion {

    private String nombre;
    private double ancho;
    private double largo;

    // Constructor, getters y setters
}
