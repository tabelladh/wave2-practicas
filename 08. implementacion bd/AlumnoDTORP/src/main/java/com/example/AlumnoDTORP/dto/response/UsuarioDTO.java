package com.example.AlumnoDTORP.dto.response;

import com.example.AlumnoDTORP.dto.AlumnoDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {

    private Integer id;
    private String user;
    private String password;
    @JsonProperty("alumno")
    private AlumnoDTO alumnoDto;

}
