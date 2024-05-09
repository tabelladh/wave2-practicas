package com.example.Promedio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DiplomaDTO {
    private String nombre;
    private  String apellido;
    private  double promedio;
    private String mensaje;

}
