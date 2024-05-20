package com.example.Certificado.service;

import com.example.Certificado.dto.AlumnoDTO;
import com.example.Certificado.dto.CertificadoDTO;


public interface ObtenerCertificado {

    public CertificadoDTO generarMensajeAprobacion(AlumnoDTO alumno);
    public Double calcularPromedio(double[] promedio);
}
