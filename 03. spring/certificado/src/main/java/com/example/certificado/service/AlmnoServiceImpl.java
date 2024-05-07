package com.example.certificado.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlmnoServiceImpl implements IAlumnoService {
    @Override
    public double calcularPromedio(List<Double> calificaciones) {
        double resultado = 0;

        for (int i = 0; i < calificaciones.size(); i++){
            resultado += calificaciones.get(i);
        }
        resultado = resultado/calificaciones.size();
        return resultado;
    }
}
