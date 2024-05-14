package com.example.Certificado.service;

import com.example.Certificado.dto.AlumnoDTO;
import com.example.Certificado.dto.CertificadoDTO;
import org.springframework.stereotype.Service;


@Service
public class ObtenerCertificadoImpl implements ObtenerCertificado {

    @Override
    public CertificadoDTO generarMensajeAprobacion(AlumnoDTO alumno) {
        double promedio = calcularPromedio(alumno.getCalificaciones());
        String mensaje = (promedio >= 6) ? "Aprobado" : "Reprobado";
        if (promedio > 9) {
            mensaje += " ¡Felicidades por el excelente desempeño!";
        }
        return new CertificadoDTO(alumno.getNombre(), promedio, mensaje);
    }

    public Double calcularPromedio( double[] calificaciones ) {
        double suma = 0;
        for (Double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
}

