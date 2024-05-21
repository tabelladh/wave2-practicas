package com.example.Ejercicio01.service;

import com.example.Ejercicio01.dto.AlumnoDTO;

import java.util.List;

public interface IAlumnoPromedio {

    double calcularPromedio(List<Double> calificaciones);
}
