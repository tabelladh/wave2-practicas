package com.example.Ejercicio02.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Propiedad {
    String nombre;
    String direccion;
    List<Habitacion> habitacionList;
}
