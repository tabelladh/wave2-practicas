package com.example.Sprint1Equipo4.controller;

import com.example.Sprint1Equipo4.dto.request.BoockingDto;
import com.example.Sprint1Equipo4.dto.request.FlightReqDto;
import com.example.Sprint1Equipo4.dto.request.FlightReservationDto;
import com.example.Sprint1Equipo4.dto.request.ReservationDtoRequest;
import com.example.Sprint1Equipo4.dto.response.ReservationDayDTO;
import com.example.Sprint1Equipo4.dto.response.ReservationMonthDTO;
import com.example.Sprint1Equipo4.dto.response.StatusDTO;
import com.example.Sprint1Equipo4.service.FlightReservationService;
import com.example.Sprint1Equipo4.service.FlightService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Validated
@RestController
@RequestMapping("/api/v1")
public class FlightReservationController {
    @Autowired
    FlightReservationService flightReservationService;

    @Autowired
    FlightService flightService;

    @GetMapping("/flight-reservations") //Listado de todas las  reservas de vuelo.
    public ResponseEntity<List<FlightReservationDto>> listReservations(){
        return new ResponseEntity<>(flightReservationService.listAllFlightReservations(), HttpStatus.OK);
    }

    @PutMapping("/flight-reservation/edit") // Actualizar una reserva buscando por id
    public ResponseEntity<StatusDTO> editReservation(@RequestBody @Valid FlightReqDto reservation, @RequestParam Long id){
        StatusDTO status = flightReservationService.updateFlightReservation(reservation, id);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @PostMapping("/flight-reservation")
    public ResponseEntity<StatusDTO> reserve(@RequestBody @Valid FlightReqDto flightReqDto) {
        return new ResponseEntity<>(flightService.reserve(flightReqDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/flight-reservation/delete") // Borrar una reserva buscando por id
    public ResponseEntity<StatusDTO> deleteReservation(@RequestParam Long id){
        StatusDTO status = flightReservationService.deleteFlightReservation(id);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @GetMapping("/income-flight-month")
    public ResponseEntity<ReservationMonthDTO> getReservationMonth(@RequestParam int month, @RequestParam int year) {
        if (month < 1 || month > 12) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        ReservationMonthDTO reservationMonth = flightReservationService.getReservationMonth(month, year);
        return new ResponseEntity<>(reservationMonth, HttpStatus.OK);
    }
    @GetMapping("/income-flight-day")
    public ResponseEntity<ReservationDayDTO> getReservationDay(@RequestParam  @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate date){
        ReservationDayDTO reservationDay = flightReservationService.getReservationDay(date);
        return new ResponseEntity<>(reservationDay, HttpStatus.OK);
    }

}
