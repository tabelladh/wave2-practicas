package com.example.PropiedadInmobiliaria.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PropiedadInmobiliariaDTO {
    private String nombre;
    private String direccion;
    private List<HabitacionDTO> habitaciones;

}