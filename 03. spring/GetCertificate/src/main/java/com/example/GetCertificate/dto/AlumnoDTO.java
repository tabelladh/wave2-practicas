package com.example.GetCertificate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// defino la clase del modelo para representar los datos del alumno.

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDTO {
    private String nombre;
    private String apellido;
    private List<Double> calificaciones;
}
