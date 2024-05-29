package com.example.demoUnitTest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    private Integer id;
    private String nombre;
    private String apellidos;
    private List<Curso> cursosList;

}
