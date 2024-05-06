package com.example.demo.Controller;

import com.example.demo.DTO.PropiedadDTO;
import com.example.demo.DTO.RespuestaDTO;
import com.example.demo.Model.Habitacion;
import com.example.demo.Model.Propiedad;
import com.example.demo.Service.IPropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PropiedadController {

    //Inyectar la dependencia
    @Autowired
    private IPropiedadService propiedadService;

    Habitacion habitacion1= new Habitacion("Hab1", 10.0, 20.0);
    Habitacion habitacion2= new Habitacion("Hab2", 10.0, 21.0);
    List<Habitacion> habitaciones = List.of(habitacion1, habitacion2);
    PropiedadDTO propiedadDTO = new PropiedadDTO( "Propiedad1", "direccion1", habitaciones);


    @GetMapping("/PropiedadM2")
    public ResponseEntity<RespuestaDTO> ObtenerM2(){

    return new ResponseEntity<>( propiedadService.calcularTotalM2Propiedad(propiedadDTO) , HttpStatus.OK);

    }

    @GetMapping("/PropiedadValorTotal")
    public ResponseEntity<RespuestaDTO> ObtenerValorPropiedad(){

        return new ResponseEntity<>( propiedadService.calcularCostoTotalPropiedad(propiedadDTO , 800.0) , HttpStatus.OK);

    }

    @GetMapping("/HabitacionMasGrande")
    public ResponseEntity<RespuestaDTO> ObtenerHabitacionMasGrande(){

        return new ResponseEntity<>( propiedadService.retornarHabitacionMasGrande(propiedadDTO) , HttpStatus.OK);

    }


    @GetMapping("/HabitacionesM2")
    public ResponseEntity<RespuestaDTO> MostrarM2Habitaciones(){

        return new ResponseEntity<>( propiedadService.retornarm2Habitacion(propiedadDTO) , HttpStatus.OK);

    }



}

