package com.example.AlumnoDTORP.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO {

    private Integer codigo;
    private String nombre;
    private String grado;
    private Boolean certificado;
    private Double duracion;
    @JsonIgnore
    private List<AlumnoDTO> alumnosList;
}
