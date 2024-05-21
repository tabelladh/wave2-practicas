package com.example.Spring.certificado.service;

import com.example.Spring.certificado.dto.AlumnoDTO;
import com.example.Spring.certificado.model.Diploma;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    public Diploma calcularPromedio(AlumnoDTO alumnoDTO) {
        String nombre = alumnoDTO.getNombre();
        String apellido = alumnoDTO.getApellido();
        double[] calificaciones = alumnoDTO.getCalificaciones();

        double promedio = calcularPromedio(alumnoDTO.getCalificaciones());
        promedio = Math.round(promedio * 100.0) / 100.0; // Redondea el promedio a dos decimales

        String mensaje = generarMensaje(nombre, apellido, promedio);
        return new Diploma(nombre, promedio, mensaje);
    }

    private double calcularPromedio(double[] calificaciones) {
        double sum = 0;
        for (double calificacion : calificaciones) {
            sum += calificacion;
        }
        return sum / calificaciones.length;
    }

    private String generarMensaje(String nombre, String apellido, double promedio) {
        String mensaje = String.format("Estimado(a) %s %s, su promedio es %.2f.", nombre, apellido, promedio);
        if (promedio >= 6) {
            mensaje += " ¡Felicidades, ha aprobado!";
            if (promedio > 9) {
                mensaje += " ¡Además, excelente trabajo!";
            }
        } else {
            mensaje += " Lo sentimos, no ha alcanzado el promedio mínimo para aprobar.";
        }
        return mensaje;
    }
}