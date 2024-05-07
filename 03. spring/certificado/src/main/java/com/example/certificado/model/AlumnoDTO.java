package com.example.certificado.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AlumnoDTO {

    private String nombre;
    private List<Double> calificaciones;

}
