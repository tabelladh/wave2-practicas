package com.example.Promedio.service;


import com.example.Promedio.dto.AlumnoDTO;
import com.example.Promedio.dto.DiplomaDTO;
import org.springframework.stereotype.Service;

@Service
public class DiplomaService {
    public DiplomaDTO generarDiploma(AlumnoDTO alumno) {
        double promedio = (alumno.getCalificacion1() + alumno.getCalificacion2() + alumno.getCalificacion3()) / 3;


        String mensaje;
        if (promedio > 9) {
            mensaje = "¡Felicidades por tu desempeño excepcional!";
        } else if (promedio >= 6) {
            mensaje = "¡Aprobaste!";
        } else {
            mensaje = "No aprobaste.";
        }

        DiplomaDTO diploma = new DiplomaDTO();
        diploma.setNombre(alumno.getNombre() + " " + alumno.getApellido());
        diploma.setPromedio(promedio);
        diploma.setMensaje(mensaje);
        return diploma;
    }
}