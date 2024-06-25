package com.digitalhouse.obtenerdiploma.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
 @EqualsAndHashCode
public class StudentDTO {
    @NotBlank(message = "El nombre del alumno no puede estar vacío.")
    @Pattern(regexp="^[A-Z].*", message="El nombre del alumno debe comenzar con mayúscula.")
    @Size(min = 1, max= 50, message = "La longitud del nombre no puede superar los 50 caracteres.")
    String studentName;
    String message;
    Double averageScore;
    @NotEmpty(message = "El email no puede estar vacio")
    @Email
    String email;
    @Pattern(regexp = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]")
    String url;
    @NotEmpty(message = "La lista no puede ser vacía")

    List< @Valid SubjectDTO >  subjects;
}
