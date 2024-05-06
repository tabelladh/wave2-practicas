package com.example.demo.Service;

import com.example.demo.DTO.AlumnoDTO;
import com.example.demo.DTO.RespuestaDTO;

import java.util.List;

public interface IAlumnoService {

   RespuestaDTO calcularPromedio(AlumnoDTO alumnoDTO);

}
