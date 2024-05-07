package com.example.demoMetrosCuadrados.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HabitacionDTO {

    private String nombre;
    private Double ancho;
    private Double largo;
    private Double metrosCuadrados;


}