package com.example.AlumnoDTORP.service;

import com.example.AlumnoDTORP.dto.AlumnoDTO;
import com.example.AlumnoDTORP.dto.RespuestaDTO;

import java.util.List;

public interface IAlumnoService {

    List<AlumnoDTO> listarAlumnos();

    AlumnoDTO buscarPorId(Integer id);

    RespuestaDTO agregarAlumno(AlumnoDTO alumnoDTO);

    RespuestaDTO borrarAlumno(Integer id);

    AlumnoDTO actualizarAlumno(AlumnoDTO alumnoDTO);

    Boolean existeAlumno(Integer id);
}
