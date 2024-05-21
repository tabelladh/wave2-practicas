package com.example.Ejercicio01.service;

import com.example.Ejercicio01.dto.AlumnoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoPromedioImpl implements IAlumnoPromedio {


    @Override
    public double calcularPromedio(List<Double> calificaciones) {
        double resultado = 0 ;
        for (Double calificacion : calificaciones) {
            resultado += calificacion;
        }

        resultado = resultado/calificaciones.size();
        return resultado;
    }
}
