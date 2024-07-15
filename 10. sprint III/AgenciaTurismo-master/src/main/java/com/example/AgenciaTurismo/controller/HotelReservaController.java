package com.example.AgenciaTurismo.controller;

import com.example.AgenciaTurismo.dto.request.FinalHotelReservationDTO;
import com.example.AgenciaTurismo.dto.response.ResponseDTO;
import com.example.AgenciaTurismo.service.IHotelReservaService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/hotel-booking")
public class HotelReservaController {
    @Autowired
    IHotelReservaService service;

    //HOTELES RESERVADOS
    @GetMapping
    public ResponseEntity<?> listarReserva() {
        return new ResponseEntity<>(service.listarReservas(), HttpStatus.OK);
    }

    //ALTA RESERVA HOTEL
    @PostMapping("/new")
    public ResponseEntity<?> crearReserva(@RequestBody @Valid FinalHotelReservationDTO finalHotelReservationDTO) {
        return new ResponseEntity<>(service.createReserva(finalHotelReservationDTO), HttpStatus.CREATED);
    }

    //MODIFICAR RESERVA HOTEL
    @PutMapping("/edit/{id}")
    public ResponseEntity<?> actualizarReserva(@PathVariable Long id, @RequestBody FinalHotelReservationDTO finalHotelReservationDTO) {
        return new ResponseEntity<>(service.updateReserva(id, finalHotelReservationDTO), HttpStatus.CREATED);
    }

    //BORRAR RESERVA HOTEL
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> eliminarReserva(@PathVariable @NotNull Long id) {
        return new ResponseEntity<>(service.deleteReserva(id), HttpStatus.OK);
    }

}
