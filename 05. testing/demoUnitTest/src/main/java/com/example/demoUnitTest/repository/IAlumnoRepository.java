package com.example.demoUnitTest.repository;

import com.example.demoUnitTest.model.Alumno;

public interface IAlumnoRepository {

    public Alumno findById(Integer id);

}
