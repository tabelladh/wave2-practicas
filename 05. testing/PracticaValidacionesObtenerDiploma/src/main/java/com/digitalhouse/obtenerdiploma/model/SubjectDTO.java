package com.digitalhouse.obtenerdiploma.model;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDTO {

    @NotBlank (message = "El nombre de la materia no puede estar vacio")
    @Pattern(regexp = "^[A-Z].*", message = "El nombre debe comenzar con una letra mayúscula")
    @Size(max = 30, message = "La longitud de nombre no puede superar los 30 caracteres")
    String name;

    @NotBlank (message = "La nota no puede estar vacia")
    @Min (value = 0, message = "La nota minima es 0")
    @Max (value = 10, message = "La maxima nota es 10")
    Double score;
}
