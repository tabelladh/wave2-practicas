package com.example.demo.DTO;

import jdk.javadoc.doclet.DocletEnvironment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HabitacionDTO {

    private String nombre;
    private Double ancho;
    private Double largo;
    private Double metrosCuadrados;


}
