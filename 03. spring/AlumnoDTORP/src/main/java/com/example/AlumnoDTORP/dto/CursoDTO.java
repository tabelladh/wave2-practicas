package com.example.AlumnoDTORP.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO {
    @Positive(message = "El codigo debe ser positivo")
    @NotNull(message = "El codigo no puede ser nulo")
    private Integer codigo;

    @Size(min = 3, max = 20, message = "El nombre del curso debe tener entre 3 y 20 caracteres")
    @NotBlank(message = "El nombre del curso no puede ser nulo")
    private String nombre;

    @Size(min = 3, max = 20, message = "El tipo de grado debe tener entre 3 y 20 caracteres")
    @NotBlank(message = "El tipo de grado no puede ser nulo")
    private String grado;

    @AssertTrue(message = "El certificado debe ser verdadero o falso")
    @NotNull(message = "El certificado no puede ser nulo")
    private Boolean certificado;

    @Positive(message = "La duracion debe ser positiva")
    @NotNull(message = "La duracion no puede ser nula")
    private Double duracion;
}
