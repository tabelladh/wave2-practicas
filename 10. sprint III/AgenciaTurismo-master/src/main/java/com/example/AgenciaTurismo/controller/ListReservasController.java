package com.example.AgenciaTurismo.controller;


import com.example.AgenciaTurismo.service.IListReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/income")
@Validated
public class ListReservasController {

    @Autowired
    IListReservasService listReservasService;

    @GetMapping
    public ResponseEntity<?> listarReservas() {
        return new ResponseEntity<>(listReservasService.listarReservas(), HttpStatus.OK);
    }

    @GetMapping("/dia")
    public ResponseEntity<?> listarReservasDia(@RequestParam("dia") String dia) {
        LocalDate fechaBuscada = LocalDate.parse(dia);
        return new ResponseEntity<>(listReservasService.listarReservasPorDia(fechaBuscada), HttpStatus.OK);
    }

    @GetMapping("/mes")
    public ResponseEntity<?> listarReservasMes(@RequestParam("mes") Integer mes) {
        return new ResponseEntity<>(listReservasService.listarReservasPorMes(mes), HttpStatus.OK);
    }


}
