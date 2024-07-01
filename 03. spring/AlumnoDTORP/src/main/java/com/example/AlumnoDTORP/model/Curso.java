package com.example.AlumnoDTORP.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    private Integer codigo;
    private String nombre;
    private String grado;
    private Boolean certificado;
    private Double duracion;


}
