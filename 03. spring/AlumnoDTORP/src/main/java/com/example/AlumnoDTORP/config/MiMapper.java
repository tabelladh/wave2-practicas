package com.example.AlumnoDTORP.config;

import com.example.AlumnoDTORP.dto.AlumnoDTO;
import com.example.AlumnoDTORP.dto.CursoDTO;
import com.example.AlumnoDTORP.model.Alumno;
import com.example.AlumnoDTORP.model.Curso;

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

    public static Alumno mapAlumnoDTOToAlumno(AlumnoDTO alumnoDTO){

        return new Alumno(
                alumnoDTO.getId(),
                alumnoDTO.getNombre(),
                alumnoDTO.getApellidos(),
                alumnoDTO.getFechaNacimiento(),
                alumnoDTO.getDni(),
                alumnoDTO.getDireccion(),
                alumnoDTO.getCursosList().stream(
                ).map(c -> new Curso(
                        c.getCodigo(),
                        c.getNombre(),
                        c.getGrado(),
                        c.getCertificado(),
                        c.getDuracion()
                )).toList());
    }

}
