package com.example.demoDto.service;

import com.example.demoDto.dto.AlumnoDto;

import java.util.ArrayList;
import java.util.List;

public class AlumnoService implements IAlumnoService{

    List<AlumnoDto> alumnoDtoList = new ArrayList<>();

    @Override
    public AlumnoDto agregar(AlumnoDto alumnoDto) {
        alumnoDtoList.add(alumnoDto);
        return alumnoDto;
    }

    @Override
    public List<AlumnoDto> listar() {
        return alumnoDtoList;
    }
}
