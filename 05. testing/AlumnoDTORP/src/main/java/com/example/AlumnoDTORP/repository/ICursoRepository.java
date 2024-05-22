package com.example.AlumnoDTORP.repository;

import com.example.AlumnoDTORP.model.Curso;

import java.util.List;

public interface ICursoRepository {

    List<Curso> findAll();

    Curso findById(Integer codigo);
}
