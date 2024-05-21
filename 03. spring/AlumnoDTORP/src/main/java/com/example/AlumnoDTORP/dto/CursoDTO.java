package com.example.AlumnoDTORP.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO {

    @Positive(message = "El id debe ser positivo y distinto a 0")
    @NotNull(message = "El id no puede ser nulo")
    private Integer codigo;

    @NotNull(message = "El nombre no puede ser nulo")
    private String nombre;

    @NotNull(message = "El grado no puede ser nulo")
    private String grado;

    @NotNull(message = "El campo certificado es obligatorio")
    private Boolean certificado;

    @Min(value = 1,message = "la duracion no puede ser menor a 1 hora")
    private Double duracion;

}
