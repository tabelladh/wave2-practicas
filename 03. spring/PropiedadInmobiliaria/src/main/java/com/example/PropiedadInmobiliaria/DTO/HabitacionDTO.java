package com.example.PropiedadInmobiliaria.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class HabitacionDTO {
    private String nombre;
    private double ancho;
    private double largo;

}