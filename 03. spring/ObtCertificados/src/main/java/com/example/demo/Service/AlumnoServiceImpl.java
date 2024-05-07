package com.example.demo.Service;


import com.example.demo.DTO.AlumnoDTO;
import com.example.demo.DTO.RespuestaDTO;
import org.springframework.stereotype.Service;

@Service
public class  AlumnoServiceImpl implements IAlumnoService {

    @Override
    public RespuestaDTO calcularPromedio(AlumnoDTO alumnoDTO) {
        Double suma = 0.0;
        Double promedio = 0.0;
        String msj = "";
        for (Double d : alumnoDTO.getCalificaciones()) {
            suma += d;
        }

        promedio = suma / (alumnoDTO.getCalificaciones().size());

        if (promedio > 9) {
            msj = "Bravo -> Diploma -> Se saco mas de 9 = Distincion especial";
        } else if (promedio > 6) {
            msj = "Bravo -> Diploma -> Se saco mas de 6";
        } else {
            msj = "Anda a casa nomas";
        }


        RespuestaDTO respuestaDTO = new RespuestaDTO(
                "nombre: " + alumnoDTO.getNombre() + " apellido: " + alumnoDTO.getApellidos() + " " + msj
        );
        return respuestaDTO;
    }
}
