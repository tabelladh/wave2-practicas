package com.digitalhouse.obtenerdiploma.model;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SubjectDTO {
    @NotBlank(message = "El nombre de la materia no puede estar vacio")
    @Pattern(regexp = "^[A-Z].*", message = "El nombre de la materia debe empezar con mayuscula")
    @Size(max = 30, message = "La longitud del nombre no puede superar los 30 caracteres")
    String name;
    @NotNull(message = "La nota no puede estar vacia")
    @Min(value = 0, message = "La minima nota es 0.0")
    @Max(value = 10, message = "La maxima nota es 10.0")
    Double score;
}
