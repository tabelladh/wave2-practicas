package com.example.demoUnitTest.service;

import com.example.demoUnitTest.model.Alumno;
import com.example.demoUnitTest.repository.IAlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraPromedioServiceImpl implements ICalculadoraPromedioService {

    @Autowired
    private IAlumnoRepository AlumnoRepository;


    /// SUMAR
    public Double sumar(Double n1, Double n2){
        return n1 + n2;
    }

    public Double promedio(Double n1, Double n2){
        return sumar(n1, n2)/ 2;
    }


    public Double promedioDeAlumno(Integer id){
        Alumno alumno = AlumnoRepository.findById(id);

        if(alumno != null){
            return promedio(alumno.getCursosList().get(0).getPromedioCurso(),
                    alumno.getCursosList().get(1).getPromedioCurso());
        } else {
            throw new RuntimeException("Alumno no encontrado");
        }

    }







    /// APLICAR PROMEDIO A UN ALUMNO



}
