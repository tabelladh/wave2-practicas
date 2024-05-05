package com.example.GetCertificate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DiplomaDTO {
    private String nombre;
    private double promedio;
    private String mensaje;
}