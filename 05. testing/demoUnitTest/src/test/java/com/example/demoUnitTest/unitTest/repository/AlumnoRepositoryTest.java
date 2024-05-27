package com.example.demoUnitTest.unitTest.repository;

import com.example.demoUnitTest.model.Alumno;
import com.example.demoUnitTest.model.Curso;
import com.example.demoUnitTest.repository.AlumnoRepositoryImpl;
import com.example.demoUnitTest.repository.IAlumnoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AlumnoRepositoryTest {

    IAlumnoRepository alumnoRepository = new AlumnoRepositoryImpl();

    private static final Alumno alumnoDeEntrada = new Alumno( 1, "Juan", "Martinez",
           List.of(new Curso(101, "Matemáticas", 10.0),
                   new Curso(102, "Historia", 10.0)
           ));
    private static final Alumno alumnoDeEntrada2 = new Alumno( 2, "María" , "González",
            List.of(new Curso(102, "Historia", 1.0),
                    new Curso(105, "Ciencias Naturales", 1.0)
            ));


    @Test
    @DisplayName("Test 1: FindById OK")
    @Order(1)
    public void findByIdTestOK() {
        //ARRANGE
        Alumno esperado = alumnoDeEntrada; //Lo que debería devolver el método
        Integer idDeEntrada = 1; // El parametro de entrada para que me devuelva lo esperado

        //ACT
        Alumno obtenido = alumnoRepository.findById(idDeEntrada);

        //ASSERT
        Assertions.assertEquals(esperado, obtenido, "El alumno no coincide");
    }

}


