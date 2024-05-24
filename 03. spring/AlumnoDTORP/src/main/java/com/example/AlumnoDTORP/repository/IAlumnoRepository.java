package com.example.AlumnoDTORP.repository;

import com.example.AlumnoDTORP.dto.RespuestaDTO;
import com.example.AlumnoDTORP.model.Alumno;

import java.util.List;

public interface IAlumnoRepository {

    List<Alumno> findAll();

    Alumno findById(Integer id);

    Alumno save(Alumno alumno);

    boolean delete(Integer id);

    Alumno update(Alumno alumno);


    Boolean existsById(Integer id);
}
