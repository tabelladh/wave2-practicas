package com.example.AlumnoDTORP.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO {

    @Positive(message = "El codigo debe ser positivo o distinto de 0")
    @NotNull(message = "El codigo no puede ser nulo")
    private Integer codigo;

    @Size(min = 3, max = 50, message = "El nombre del curso puede tener entre 3 y 50 caracteres" )
    @NotBlank(message = "El nombre del curso no puede ser nulo")
    private String nombre;

    @Size(min = 3, max = 50, message = "El tipo de grado puede tener entre 3 y 50 caracteres" )
    @NotBlank(message = "El tipo de grado no puede ser nulo")
    private String grado;

    @NotNull
    private Boolean certificado;

    @NotNull(message = "La duracion no puede ser nulo")
    private Double duracion;

}
