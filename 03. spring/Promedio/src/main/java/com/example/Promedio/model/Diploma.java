package com.example.Promedio.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Diploma {
    private String nombre;
    private  String apellid;
    private  double promedio;
    private String mensaje;

}
