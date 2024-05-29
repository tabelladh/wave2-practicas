package com.example.demoUnitTest.unitTest.controller;

import com.example.demoUnitTest.controller.CalculadoraPromedioController;
import com.example.demoUnitTest.model.Alumno;
import com.example.demoUnitTest.model.Curso;
import com.example.demoUnitTest.service.CalculadoraPromedioServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculadoraPromedioControllerTest {

    private static final Alumno alumnoDeEntrada = new Alumno( 1, "Juan", "Martinez",
            List.of(new Curso(101, "Matemáticas", 10.0),
                    new Curso(102, "Historia", 10.0)
            ));
    private static final Alumno alumnoDeEntrada2 = new Alumno( 2, "María" , "González",
            List.of(new Curso(102, "Historia", 1.0),
                    new Curso(105, "Ciencias Naturales", 1.0)
            ));

    @Mock //Puede ser la clase o la Interface, es lo mismo lo que importa es q los metodos esten declarados.
    private CalculadoraPromedioServiceImpl calculadoraPromedioService;

    @InjectMocks //Siempre es la clase ya que tiene el constructor
    private CalculadoraPromedioController calculadoraPromedioController;

    //  public ResponseEntity<Double> promedioDeAlumno(@PathVariable Integer id){
    @Test
    @DisplayName(" 01 - Test Controller : promedio de Alumno OK")
    public void promedioDeAlumnoTestOK() {
        //ARRANGE
        Integer idDeEntrada = 1;
        Double promedioEsperado = 10.0;

        HttpStatusCode statusEsperado = HttpStatus.OK;
        ResponseEntity<Double> promedioEsperadoResponseEntity = new ResponseEntity<>(promedioEsperado, statusEsperado);

        //ACT
        Mockito.when(calculadoraPromedioService.promedioDeAlumno(idDeEntrada)).thenReturn(promedioEsperado);
        ResponseEntity<Double> promedioObtenidoResponseEntity = calculadoraPromedioController.promedioDeAlumno(idDeEntrada);

        //ASSERT
        Assertions.assertEquals(promedioEsperadoResponseEntity, promedioObtenidoResponseEntity, "Los StatusCode son diferentes");
    }



    // public ResponseEntity<Double> sumar(@PathVariable Double n1, @PathVariable Double n2){
    @Test
    @DisplayName(" 02 - Test Controller : sumar OK")
    public void sumarTestOK() {
        //ARRANGE
        Double n1DeEntrada = 1.0;
        Double n2DeEntrada = 2.0;
        Double sumaEsperada = 3.0;
        Enum statusEsperado = HttpStatus.OK;

        //ACT
        when(calculadoraPromedioService.sumar(n1DeEntrada, n2DeEntrada)).thenReturn(3.0);
        Double sumaObtenida = calculadoraPromedioController.sumar(n1DeEntrada, n2DeEntrada).getBody();
        HttpStatusCode statusObtenido = calculadoraPromedioController.sumar(n1DeEntrada, n2DeEntrada).getStatusCode();

        //ASSERT
        Assertions.assertEquals(sumaEsperada, sumaObtenida, "Los valores de la suma no son iguales");
        Assertions.assertEquals(statusEsperado, statusObtenido, "Los Status Code son diferentes");

    }


}
