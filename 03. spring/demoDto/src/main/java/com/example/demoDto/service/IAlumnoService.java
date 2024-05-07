package com.example.demoDto.service;

import com.example.demoDto.dto.AlumnoDto;

import java.util.List;

public interface IAlumnoService {
    AlumnoDto agregar(AlumnoDto alumnoDto);
    List<AlumnoDto>listar();
}
