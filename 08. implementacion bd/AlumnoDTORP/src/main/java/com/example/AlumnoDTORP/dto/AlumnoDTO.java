package com.example.AlumnoDTORP.dto;

import com.example.AlumnoDTORP.dto.response.UsuarioDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoDTO {

    @Positive(message = "El id debe ser positivo y distinto a 0")
    private Integer id;

    @Size(min = 3, max = 20, message = "El nombre debe tener entre 3 y 20 caracteres")
    @NotBlank(message = "El nombre no puede ser nulo")
    private String nombre;

    @Size(min = 3, max = 20, message = "El apellido debe tener entre 3 y 20 caracteres")
    @NotBlank(message = "El nombre no puede ser nulo")
    private String apellidos;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonProperty("fecha_nacimiento")
    @PastOrPresent(message = "La fecha de nacimiento no puede ser futura")
    private LocalDate fechaNacimiento;

    @NotNull(message = "El dni no puede ser nulo")
    @Min(value = 100000, message = "El DNI debe tener al menos 8 dígitos")
    @Max(value = 99999999, message = "El DNI no puede tener más de 8 dígitos")
    private Integer dni;

    @NotEmpty(message = "La direccion no puede ser vacia")
    private String direccion;

    @NotEmpty(message = "La lista de cursos no puede ser vacia")
    @Size(min = 1, message = "La lista de cursos no puede ser vacia")
    @JsonProperty("cursos_list")
    private List<CursoDTO> cursosList;

}
