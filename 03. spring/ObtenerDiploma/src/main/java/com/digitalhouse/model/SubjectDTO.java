package com.digitalhouse.model;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SubjectDTO {
    @NotNull(message = "El nombre de la materia no puede estar vacío.")
    @Pattern(regexp = "^[A-Z].*", message = "El nombre de la materia debe comenzar con mayúscula.")
    @Size(max = 30, message = "La longitud del nombre no puede superar los 30 caracteres.")
    String name;

    @NotNull(message = "La nota no puede estar vacía.")
    @Min(value = 0, message = "La mínima nota es 0.0.")
    @Max(value = 10, message = "La máxima nota es 10.0.")
    Double score;
}