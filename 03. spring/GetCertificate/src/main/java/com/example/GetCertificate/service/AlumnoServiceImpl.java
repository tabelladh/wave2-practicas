package com.example.GetCertificate.service;

import com.example.GetCertificate.dto.AlumnoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    @Override
    public double calcularPromedio(AlumnoDTO alumno) {
        List<Double> calificaciones = alumno.getCalificaciones();
        double suma = 0;
        for (Double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma/calificaciones.size();
    }
}




