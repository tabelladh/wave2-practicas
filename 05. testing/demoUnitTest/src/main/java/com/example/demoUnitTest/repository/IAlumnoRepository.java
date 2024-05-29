package com.example.demoUnitTest.repository;

import com.example.demoUnitTest.model.Alumno;

import java.util.List;

public interface IAlumnoRepository {

    public Alumno findById(Integer id);

    public List<Alumno> findAll();

}
