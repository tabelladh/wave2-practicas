package com.example.demoUnitTest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    private Integer codigo;
    private String nombre;
    @JsonProperty("promedio_curso")
    private Double promedioCurso;


}
