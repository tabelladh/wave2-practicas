package com.example.promedio.service;

import com.example.promedio.dto.RespuestaDTO;
import com.example.promedio.model.Alumno;

public interface IAlumno {

   RespuestaDTO calcularPromedio(Alumno alumno);
}
