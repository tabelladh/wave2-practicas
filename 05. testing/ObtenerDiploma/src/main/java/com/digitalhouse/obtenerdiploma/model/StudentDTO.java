package com.digitalhouse.obtenerdiploma.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class StudentDTO {
    @NotNull(message = "El nombre del alumno no puede estar vacío.")
    @Size(max = 50,message = "La longitud del nombre no puede superar los 50 caracteres")
    @Pattern(regexp="^[A-Z].*", message="El nombre del alumno debe comenzar con mayúscula.")
    String studentName;
    String message;
    Double averageScore;
    @NotEmpty(message = "La lista no puede ser vacía.")
    List<@Valid SubjectDTO> subjects;
}
