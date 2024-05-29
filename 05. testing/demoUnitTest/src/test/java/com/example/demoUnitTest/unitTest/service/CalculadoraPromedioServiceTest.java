package com.example.demoUnitTest.unitTest.service;

import com.example.demoUnitTest.model.Alumno;
import com.example.demoUnitTest.model.Curso;
import com.example.demoUnitTest.repository.AlumnoRepositoryImpl;
import com.example.demoUnitTest.service.CalculadoraPromedioService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class CalculadoraPromedioServiceTest {

   private static final Alumno alumnoDeEntrada = new Alumno( 1, "Juan", "Martinez",
         List.of(new Curso(101, "Matemáticas", 10.0),
               new Curso(102, "Historia", 10.0)
         ));

   @Mock //puede ser la clase o la interface: lo que importa es que los métodos estén declarados
   private AlumnoRepositoryImpl alumnoRepositoryImpl;
   @InjectMocks //siempre es con la clase porque tiene el constructor
   private CalculadoraPromedioService calculadoraPromedioService;

   @Test
   @DisplayName("Test 1:promedio de alumno OK")
   public void promedioDelAlumnoTestOK() {
      //ARRANGE
      Integer idDeEntrada = 1;
      Double promedioEsperado = 10.0;

      //ACT
      Mockito.when(alumnoRepositoryImpl.findById(idDeEntrada)).thenReturn(alumnoDeEntrada);
      Double promedioObtenido = calculadoraPromedioService.promedioDelAlumno(idDeEntrada);

      //ASSERT
      Assertions.assertEquals(promedioEsperado, promedioObtenido);
   }

   @Test
   @DisplayName("Test 2: promedio de alumno ERROR")
   public void promedioDelAlumnoTestException() {
      //ARRANGE
      Integer idDeEntrada = 4;

      //ACT
      Mockito.when(alumnoRepositoryImpl.findById(idDeEntrada)).thenReturn(null);

      //ASSERT
      Assertions.assertThrows(RuntimeException.class,
            () -> calculadoraPromedioService.promedioDelAlumno(idDeEntrada));
   }
}
