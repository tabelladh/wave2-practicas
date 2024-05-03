package com.example.AlumnoDTORP.service;

import com.example.AlumnoDTORP.dto.AlumnoDTO;
import com.example.AlumnoDTORP.dto.RespuestaDTO;

import java.util.List;

public interface IAlumnoService {

   RespuestaDTO agregarAlumno(AlumnoDTO alumnoDTO);

   List<AlumnoDTO> listarAlumnos();

}
