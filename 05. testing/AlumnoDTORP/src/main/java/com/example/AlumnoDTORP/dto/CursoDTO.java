package com.example.AlumnoDTORP.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO {
    @Positive(message = "el codigo de curso debe ser positivo")
    @NotNull(message= "el codigo no puede ser nulo")
    private Integer codigo;

    @NotBlank(message = "El nombre del curso no puede ser nulo")
    @Size(min= 3, max= 20, message= "el nombre debe tener entre 3 cacteres y 20 caracteres")
    private String nombre;

    @NotBlank(message = "El grado no puede ser nulo")
    @Size(min= 3, max= 20, message= "el grado debe tener entre 3 cacteres y 20 caracteres")
    private String grado;

    @NotNull(message = "El valor del certificado no puede ser nulo")
    private Boolean certificado;

    @Positive(message = "La duración debe ser mayor que cero")
    private Double duracion;

}
