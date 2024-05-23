package com.example.demoUnitTest.unitTest.service;

import com.example.demoUnitTest.model.Alumno;
import com.example.demoUnitTest.model.Curso;
import com.example.demoUnitTest.repository.AlumnoRepositoryImpl;
import com.example.demoUnitTest.service.CalculadoraPromedioServiceImpl;
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

    @Mock
    AlumnoRepositoryImpl AlumnoRepositoryImpl;

    @InjectMocks
    CalculadoraPromedioServiceImpl calculadoraPromedioService;



    @Test
    @DisplayName("01 - Test Service : promedio de Alumno OK")
    public void promedioDeAlumnoTestOK(){
        //ARRANGE
        Integer idDeEntrada = 1;
        Double promedioEsperado = 10.0;

        //ACT
        Mockito.when(AlumnoRepositoryImpl.findById(idDeEntrada)).thenReturn(alumnoDeEntrada);
        Double promedioObtenido = calculadoraPromedioService.promedioDeAlumno(idDeEntrada);

        //ASSERT
        Assertions.assertEquals(promedioEsperado, promedioObtenido);
    }


/* Double promedioDeAlumno(Integer id) -> Metodo a testear que provee información de que parametro entra y que devuelve.
 * RuntimeException("Alumno no encontrado") -> Excepcion que genera en caso de fallar */

    @Test
    @DisplayName("02 - Test Service : promedio de Alumno Fail")
    public void promedioDeAlumnoTestException() {
        //ARRANGE
        Integer idDeEntrada = 4;

        //ACT
        Mockito.when(AlumnoRepositoryImpl.findById(idDeEntrada)).thenReturn(null);

        //ASSERT
        Assertions.assertThrows(RuntimeException.class,
                () -> calculadoraPromedioService.promedioDeAlumno(idDeEntrada));

    }
}
