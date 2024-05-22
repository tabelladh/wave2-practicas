package com.example.service;

import com.example.dto.AlumnoDTO;
import com.example.model.Diploma;

public interface AlumnoService {
    Diploma calcularPromedio(AlumnoDTO alumnosDTO);
}
