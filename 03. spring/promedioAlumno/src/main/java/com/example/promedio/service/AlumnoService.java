package com.example.promedio.service;

import com.example.promedio.dto.RespuestaDTO;
import com.example.promedio.model.Alumno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService implements IAlumno {

    @Override
    public RespuestaDTO calcularPromedio(Alumno alumno) {

        List<Double> calificaciones = new ArrayList<>();
        calificaciones.addAll(alumno.getCalificaciones());


        double promedio = calificaciones.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElseThrow(() -> new RuntimeException("No se puede realizar el promedio"));

        RespuestaDTO respuesta = new RespuestaDTO();

        if (promedio >= 6.0) {
            respuesta.setMensaje("Nombre : " + alumno.getNombre() + " "
                    + alumno.getApellido()
                    + ", Promedio : " + String.format("%.2f", promedio) + " Aprobado");
            if (promedio > 9.0) {
                respuesta.setMensaje("Nombre : " + alumno.getNombre() + " "
                        + alumno.getApellido()
                        + ", Promedio : " + String.format("%.2f", promedio) + " Aprobado"
                        + " ¡Felicitaciones por destacarse en su clase!");
            }
        } else {
            respuesta.setMensaje("Nombre : " + alumno.getNombre() + " "
                    + alumno.getApellido() + " "
                    + ". Promedio : " + String.format("%.2f", promedio) + " Reprobado");
        }
        return respuesta;
    }

}
