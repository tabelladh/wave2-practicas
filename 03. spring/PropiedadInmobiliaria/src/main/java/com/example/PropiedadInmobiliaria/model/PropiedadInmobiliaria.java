package com.example.PropiedadInmobiliaria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class PropiedadInmobiliaria {
        private String nombre;
        private String direccion;
        private List<Habitacion> habitaciones;
}
