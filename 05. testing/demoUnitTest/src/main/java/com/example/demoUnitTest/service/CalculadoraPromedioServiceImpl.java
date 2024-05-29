package com.example.demoUnitTest.service;

import com.example.demoUnitTest.model.Alumno;
import com.example.demoUnitTest.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CalculadoraPromedioServiceImpl implements CalculadoraPromedioService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public Double sumar(Double num1, Double num2) {
        return num1 + num2;
    }

    @Override
    public Double promedio(Double num1, Double num2) {
        return sumar(num1, num2) / 2;
    }

    @Override
    public Double promedioDelAlumno(Integer id) {
        Alumno alumno = alumnoRepository.findById(id);
        if (alumno != null) {
            return promedio(alumno.getCursosList().get(0).getPromedioCurso(),
                    alumno.getCursosList().get(1).getPromedioCurso());
        } else {
            throw new RuntimeException("Alumno no encontrado");
        }
    }
}
