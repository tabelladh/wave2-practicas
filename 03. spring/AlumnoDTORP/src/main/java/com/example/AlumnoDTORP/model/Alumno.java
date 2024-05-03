package com.example.AlumnoDTORP.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    private Integer id;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private Integer dni;
    private String domicilio;
    private Curso curso;

}
