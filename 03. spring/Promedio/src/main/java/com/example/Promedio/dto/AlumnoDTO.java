package com.example.Promedio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class AlumnoDTO {
   private String nombre;
   private String apellido;
   private double calificacion1;
   private double calificacion2;
   private double calificacion3;



}
