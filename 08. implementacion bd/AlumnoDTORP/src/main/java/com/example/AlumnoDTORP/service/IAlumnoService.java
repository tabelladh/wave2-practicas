package com.example.AlumnoDTORP.service;

import com.example.AlumnoDTORP.dto.AlumnoDTO;
import com.example.AlumnoDTORP.dto.RespuestaDTO;
import com.example.AlumnoDTORP.model.Alumno;

import java.util.List;

public interface IAlumnoService {

    List<AlumnoDTO> listarAlumnos();

    AlumnoDTO buscarPorId(Integer id);

    RespuestaDTO agregarAlumno(AlumnoDTO alumnoDTO);

    RespuestaDTO borrarAlumno(Integer id);

    AlumnoDTO actualizarAlumno(Integer id, AlumnoDTO alumnoDTO);

    Boolean existeAlumno(Integer id);

    AlumnoDTO buscarPorDni(Integer dni);

    List<AlumnoDTO> buscarPorNombreYApellidos(String nombre, String apellidos);

    AlumnoDTO alumnoConCursos(Integer id);
}
