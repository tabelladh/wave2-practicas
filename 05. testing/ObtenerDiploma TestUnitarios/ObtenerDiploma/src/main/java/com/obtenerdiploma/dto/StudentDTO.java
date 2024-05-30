package com.obtenerdiploma.dto;


import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Set;




public record StudentDTO(
    @NotNull
    @Positive(message = "El id debe ser positivo y distinto a 0")
    Long id,

    @Size(min = 3, max = 20, message = "El nombre debe tener entre 3 y 20 caracteres")
    @NotBlank(message = "El nombre no puede ser nulo")
    String studentName,

    @Email(message = "Debe ser un email valido")
    String email,

    @NotNull
    @Pattern(
            regexp = "^(http?|ftp)://[^\s/$.?#].[^\s]*$",
            message = "La URL debe ser válida"
    )
    String url,

    @NotNull
    Set<@Valid SubjectDTO> subjects


){
}
