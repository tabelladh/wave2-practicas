package com.digitalhouse.obtenerdiploma.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;



import java.util.List;

@Getter @Setter
public class StudentDTO {

    @NotNull(message = "El campo de nombre no debe ser nulo")
    @Pattern(regexp = "^[A-Z].*", message = "El nombre debe comenzar con una letra mayúscula")
    @Size (max = 50, message = "La longitud de nombre no debe superar los 50 caracteres")
    String studentName;

    String message;
    Double averageScore;

    @NotEmpty (message = "La lista no puede ser vacia")
    List<@Valid SubjectDTO> subjects;
}
