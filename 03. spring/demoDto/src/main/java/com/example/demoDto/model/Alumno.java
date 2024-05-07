package com.example.demoDto.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
public class Alumno {

    private Integer id;
    private String name;
    private String address;
    private LocalDate born;
    private Curso curso;

}
