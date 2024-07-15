package com.example.AgenciaTurismo.controller;


import com.example.AgenciaTurismo.dto.request.FinalFlightReservationDTO;
import com.example.AgenciaTurismo.dto.response.ResponseDTO;
import com.example.AgenciaTurismo.service.IFlightReservaService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/flight-booking")
@Validated
public class FlightReservaController {
    @Autowired
    IFlightReservaService service;

    // VUELOS RESERVADOS
    @GetMapping
    public ResponseEntity<?> listarReserva() {
        return new ResponseEntity<>(service.listarReservas(), HttpStatus.OK);
    }

    // ALTA RESERVA VUELO
    @PostMapping("/new")
    public ResponseEntity<?> crearReserva(@RequestBody @Valid FinalFlightReservationDTO finalFlightReservationDTO) {
        return new ResponseEntity<>(service.createReserva(finalFlightReservationDTO), HttpStatus.CREATED);
    }

    // MODIFICAR RESERVA VUELO
    @PutMapping("/edit/{id}")
    public ResponseEntity<?> actualizarReserva(@PathVariable @NotNull Long id, @RequestBody @Valid FinalFlightReservationDTO finalFlightReservationDTO) {
        return new ResponseEntity<>(service.updateReserva(id, finalFlightReservationDTO), HttpStatus.CREATED);
    }

    // BORRAR RESERVA VUELO
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> eliminarReserva(@PathVariable @NotNull Long id) {
        return new ResponseEntity<>(service.deleteReserva(id), HttpStatus.OK);
    }


}
