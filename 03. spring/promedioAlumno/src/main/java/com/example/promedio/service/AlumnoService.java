package com.example.promedio.service;

import com.example.promedio.dto.RespuestaDTO;
import com.example.promedio.model.Alumno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService implements IAlumno {

    // Se solicita que se calcule el promedio de las calificaciones recibidas

    @Override
    public RespuestaDTO calcularPromedio(Alumno alumno) {
        List<Double> calificaciones = new ArrayList<>();
        calificaciones.stream().mapToDouble(x -> calificaciones.getFirst()).average();

        Double promedio = 0.0;
        for (Double calificacion : calificaciones) {
            promedio += calificacion;
        }
        promedio = promedio / calificaciones.size();
        alumno.setPromedio(promedio);
        return alumno;

    }
}
