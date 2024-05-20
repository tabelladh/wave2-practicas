package com.example.Certificado.controller;


import com.example.Certificado.dto.AlumnoDTO;
import com.example.Certificado.dto.CertificadoDTO;
import com.example.Certificado.service.ObtenerCertificado;
import com.example.Certificado.service.ObtenerCertificadoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
public class CertificadoController {

    @Autowired
    ObtenerCertificado certificadoService;

    @PostMapping("/certificado")
    public ResponseEntity<CertificadoDTO> generarCertificado(@RequestBody AlumnoDTO alumno) {
        CertificadoDTO certificado = certificadoService.generarMensajeAprobacion(alumno);
        return ResponseEntity.ok(certificado);
    }


    @PostMapping("/asdasd")
    public ResponseEntity<PeopleDTO> generarPersona(@RequestBody PersonaDTO persona) {
        CertificadoDTO certificado = certificadoService.generarMensajeAprobacion(alumno);
        return ResponseEntity.ok(certificado);
    }
}

