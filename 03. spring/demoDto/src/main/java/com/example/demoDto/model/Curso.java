package com.example.demoDto.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Curso {

    private Integer id;
    private String name;
    private String grado;
    private Boolean certificate;
    private Double time;

}
