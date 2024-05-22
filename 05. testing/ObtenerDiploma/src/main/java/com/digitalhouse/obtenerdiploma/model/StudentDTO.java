package com.digitalhouse.obtenerdiploma.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class StudentDTO {

    @NotBlank(message = "El nombre del alumno no puede estar vacío")
    @Pattern(regexp = "[A-Z].*", message = "El nombre debe comenzar con mayúscula")
    @Size(max = 50, message = "El nombre no puede tener más de 50 caracteres")
    String studentName;
    String message;
    Double averageScore;
    @NotEmpty(message = "La lista no puede estar vacía")
    List<@Valid SubjectDTO> subjects;
}
