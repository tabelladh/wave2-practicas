package com.example.AlumnoDTORP.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoDTO {
    //@JsonIgnore
    private Integer id;
    private String nombre;
    private String apellidos;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonProperty("fecha_nacimiento")
    private LocalDate fechaNacimiento;
    private Integer dni;
    private String direccion;
    @JsonProperty("cursos_list")
    private List<CursoDTO> cursosList;



}
