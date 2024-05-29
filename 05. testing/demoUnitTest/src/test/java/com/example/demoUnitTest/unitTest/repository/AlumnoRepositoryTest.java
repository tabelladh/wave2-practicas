package com.example.demoUnitTest.unitTest.repository;

import com.example.demoUnitTest.model.Alumno;
import com.example.demoUnitTest.model.Curso;
import com.example.demoUnitTest.repository.AlumnoRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AlumnoRepositoryTest {

   private static final Alumno alumnoDeEntrada = new Alumno( 1, "Juan", "Martinez",
         List.of(new Curso(101, "Matemáticas", 10.0),
               new Curso(102, "Historia", 10.0)
         ));

   @Test
   @DisplayName("Test 1: FindById OK")
   public void findByIdTest() {
   //ARRANGE
   Alumno esperado = alumnoDeEntrada; //lo que deberia devolver el parámetro
   Integer idDeEntrada = 1; //para que me devuelva lo esperado

   //ACT
   Alumno obtenido = new AlumnoRepositoryImpl().findById(idDeEntrada);

   //ASSERT
      Assertions.assertEquals(esperado, obtenido);
   }
}
