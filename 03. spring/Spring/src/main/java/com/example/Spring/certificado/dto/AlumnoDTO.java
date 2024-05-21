package com.example.Spring.certificado.dto;

import lombok.*;

import java.util.Arrays;

@Data
@AllArgsConstructor

public class AlumnoDTO {
    private String nombre;
    private String apellido;
    private double[] calificaciones = new double[3];

    // Constructor que garantiza que siempre haya 3 calificaciones
    public AlumnoDTO() {
        Arrays.fill(calificaciones, 0.0); // Inicializa todas las calificaciones a 0.0
    }

    public void setCalificaciones(double[] calificaciones) {
        if (calificaciones.length != 3) {
            throw new IllegalArgumentException("Se esperan 3 calificaciones");
        }
        this.calificaciones = calificaciones;
    }
}
