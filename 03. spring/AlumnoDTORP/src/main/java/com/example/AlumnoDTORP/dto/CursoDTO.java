package com.example.AlumnoDTORP.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
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
    @Size(min = 3, max = 20, message = "El nombre debe tener entre 3 y 20 caracteres")
    @NotBlank(message = "El nombre no puede ser nulo")
    private String nombre;
    @Size(min = 3, max = 20, message = "El grado debe tener entre 3 y 20 caracteres")
    @NotBlank(message = "El grado no puede ser nulo")
    private String grado;
    @NotNull(message = "El certificado no puede ser nulo")
    private Boolean certificado;
    @Positive(message = "La duración debe ser mayor a 0")
    private Double duracion;

}
