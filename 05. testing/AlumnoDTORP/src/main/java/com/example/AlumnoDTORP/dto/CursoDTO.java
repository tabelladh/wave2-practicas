package com.example.AlumnoDTORP.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO {

    @NotNull(message = "El codigo del curso no debe ser nulo")
    @Positive(message="El codigo del curso debe ser un valor positivo")
    private Integer codigo;

    @Size(min= 3, max= 10, message = "El nombre debe contener minimo tres caracteres")
    private String nombre;

    @NotBlank(message="El grado no debe estár nulo o vacío")
    private String grado;

    @AssertTrue
    private Boolean certificado;

    @NotNull(message="La duracion no debe estár nula")
    @Positive(message="La duracion debe ser un valor positivo")
    private Double duracion;

}
