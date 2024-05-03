package com.example.AlumnoDTORP.service;

import com.example.AlumnoDTORP.dto.AlumnoDTO;
import com.example.AlumnoDTORP.dto.RespuestaDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoServiceImpl implements IAlumnoService {
    List<AlumnoDTO> alumnosList = new ArrayList<>();

    @Override
    public RespuestaDTO agregarAlumno(AlumnoDTO alumnoDTO) {
        alumnosList.add(alumnoDTO);
        return new RespuestaDTO("Alumno agregado");
    }

    @Override
    public List<AlumnoDTO> listarAlumnos() {
        return alumnosList;
    }

}
