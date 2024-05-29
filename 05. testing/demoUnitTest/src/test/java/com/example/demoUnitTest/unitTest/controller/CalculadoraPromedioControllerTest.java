package com.example.demoUnitTest.unitTest.controller;

import com.example.demoUnitTest.controller.CalculadoraPromedioController;
import com.example.demoUnitTest.service.CalculadoraPromedioServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CalculadoraPromedioControllerTest {
   @Mock
   CalculadoraPromedioServiceImpl calculadoraPromedioServiceImpl;

   @InjectMocks
   CalculadoraPromedioController calculadoraPromedioController;

   @Test
   @DisplayName("Test controller: promedio de alumno OK")
   public void promedioDelAlumnoTestOK2(){
      //ARRANGE
      Integer idDeEntrada = 1;
      Double promedioEsperado = 10.0;
      ResponseEntity<Double> promedioEsperadoResponseEntity =
            new ResponseEntity<>(promedioEsperado, HttpStatus.OK);

      //ACT
      Mockito.when(calculadoraPromedioServiceImpl.promedioDelAlumno(idDeEntrada)).thenReturn(promedioEsperadoResponseEntity.getBody());
      ResponseEntity<Double> promedioObtenido = calculadoraPromedioController.promedioDelAlumno(idDeEntrada);

      //ASSERT
      Assertions.assertEquals(promedioEsperadoResponseEntity, promedioObtenido, "Los promedios son iguales");

   }
}
