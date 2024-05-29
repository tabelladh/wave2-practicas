package com.example.demoUnitTest.repository;

import com.example.demoUnitTest.model.Alumno;

public interface AlumnoRepository {
   Alumno findById(Integer id);
}
