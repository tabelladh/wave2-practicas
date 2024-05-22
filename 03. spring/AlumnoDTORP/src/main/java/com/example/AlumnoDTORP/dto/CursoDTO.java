package com.example.AlumnoDTORP.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO {

    @Positive(message = "El codigo de curso debe ser positivo y distinto a 0")
    @NotNull(message = "El codigo de curso no puede ser nulo")
    private Integer codigo;

    @Size(min = 3, max = 20, message = "El nombre debe tener entre 3 y 20 caracteres")
    @NotBlank(message = "El nombre no puede ser nulo")
    private String nombre;

    @Size(min = 3, max = 20, message = "El grado debe tener entre 3 y 20 caracteres")
    @NotBlank(message = "El grado no puede ser nulo")
    private String grado;

    @NotNull(message = "El certificado no puede ser nulo")
    //@Pattern(regexp = "true|false", message = "Certificado debe ser booleano")
    private Boolean certificado;

    //@DecimalMin(value = "149.9"  , message = "La duracion de un curso debe ser mayor a 149.9")
    //@DecimalMax(value = "999.9"  , message = "La duracion de un curso debe ser menor a 999.9")
    @NotNull(message = "La duracion de un curso debe ser un valor entre 149.9 y 999.9")
    @Digits(integer = 4, fraction = 1, message = "La duracion de un curso debe ser un valor entre 149.9 y 999.9")
    private Double duracion;

}
