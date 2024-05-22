package com.digitalhouse.obtenerdiploma.model;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SubjectDTO {
    @NotBlank(message = "El nombre de la materia no puede estar vacío")
    @Pattern(regexp = "[A-Z].*", message = "El nombre de la materia debe comenzar con mayúscula")
    @Size(max = 30, message = "El nombre de la materia no debe tener más de 30 caracteres")
    String name;

    @NotNull(message = "La nota de la materia no puede estar vacía")
    @DecimalMin(value = "0.0", message = "La nota minima es 0.0")
    @DecimalMax(value = "10.0", message = "La nota mnaxima es 10.0")
    Double score;
}
