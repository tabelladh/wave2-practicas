package com.example.Spring.certificado.service;

import com.example.Spring.certificado.dto.AlumnoDTO;
import com.example.Spring.certificado.model.Diploma;

public interface AlumnoService {
    Diploma calcularPromedio(AlumnoDTO alumnosDTO);
}
