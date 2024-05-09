package com.example.Promedio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Alumno {


       private String nombre;
       private String apellido;
       private double calificacion1;
       private double calificacion2;
       private double calificacion3;


    }


