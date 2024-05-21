package com.example.AlumnoDTORP.dto.response;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDuracionDTO {

    @NotBlank(message = "en nombre no puede ser nulo, ni espacio vacio")
    private String nombre;
    @Min(value = 1,message = "el curso no puede durar menos de 1 hora")
    private Double duracion;

}
