package com.example.GetCertificate.controller;


import com.example.GetCertificate.dto.AlumnoDTO;
import com.example.GetCertificate.dto.DiplomaDTO;
import com.example.GetCertificate.service.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//Creo el controlador REST que manejará las solicitudes POST para recibir los datos del alumno
// y devolver el diploma:

@RestController
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }
//con ResponseEntity se logra controlar el código de estado HTTP y añadir encabezados si es necesario.

    @PostMapping("/calcularPromedio")
    public ResponseEntity<DiplomaDTO> calcularPromedio(@RequestBody AlumnoDTO alumno) {
        double promedio = alumnoService.calcularPromedio(alumno);
        String mensaje = promedio >= 6 ? "Aprobado" : "Reprobado";
        if (promedio > 9) {
            mensaje += " ¡Felicidades por tu excelente desempeño!";
        }
        DiplomaDTO diploma = new DiplomaDTO(alumno.getNombre(), promedio, mensaje);
        return new ResponseEntity<>(diploma, HttpStatus.CREATED);
    }
}
