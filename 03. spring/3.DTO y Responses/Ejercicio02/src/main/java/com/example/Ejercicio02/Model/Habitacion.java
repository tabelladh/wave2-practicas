package com.example.Ejercicio02.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Habitacion {

    String nombre;
    Double ancho;
    Double largo;

    public Double getAncho() {
        return ancho;
    }

    public Double getLargo() {
        return largo;
    }
}
