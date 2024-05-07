package com.example.Constructora.Controller;

import com.example.Constructora.DTO.HabitacionDTO;
import com.example.Constructora.Model.Habitacion;
import com.example.Constructora.Service.IConstructoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class ConstructoraController {

        @Autowired
        private IConstructoraService constructoraService;

        @GetMapping("/propiedad")
        public Double habArea(@RequestBody List<Habitacion> habitacionList) {
                return constructoraService.areaHab(habitacionList);

        }

        @GetMapping("/propiedad/valor")
        public Double valorPropiedad(@RequestBody List<Habitacion> habitacionList) {
                return constructoraService.valorPropiedad(habitacionList);

        }

        @GetMapping("/propiedad/habitacionGrande")
        public HabitacionDTO habGrande(@RequestBody List<Habitacion> habitacionList) {
                return constructoraService.habGrande(habitacionList);

        }


        @GetMapping("/propiedad/habitaciones")
        public List<HabitacionDTO> areaPorHabitacion(@RequestBody List<Habitacion> habitacionList) {
                return constructoraService.areaPorHabitacion(habitacionList);
        }



}


        //inyectar la dependencia
//        @Autowired
////        private ;
////
////        @PostMapping("/perimetro")
////        public ResponseEntity<> agregarAlumno(@RequestBody ){
////            return new ResponseEntity<>(, HttpStatus.OK);
////        }

