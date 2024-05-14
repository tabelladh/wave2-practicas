package com.example.AlumnoDTORP.config;

import com.example.AlumnoDTORP.dto.AlumnoDTO;
import com.example.AlumnoDTORP.dto.CursoDTO;
import com.example.AlumnoDTORP.model.Alumno;

public class MiMapper {

    public static AlumnoDTO mapAlumnoToAlumnoDTO(Alumno alumno){

        return new AlumnoDTO(
                alumno.getId(),
                alumno.getNombre(),
                alumno.getApellidos(),
                alumno.getFechaNacimiento(),
                alumno.getDni(),
                alumno.getDireccion(),
                alumno.getCursosList().stream(
                ).map(c -> new CursoDTO(
                        c.getCodigo(),
                        c.getNombre(),
                        c.getGrado(),
                        c.getCertificado(),
                        c.getDuracion()
                )).toList());
    }

}
