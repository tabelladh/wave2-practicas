package com.example.AgenciaTurismo.controller;

import com.example.AgenciaTurismo.dto.FlightDTO;
import com.example.AgenciaTurismo.dto.request.FinalFlightReservationDTO;
import com.example.AgenciaTurismo.dto.request.FlightConsultDTO;
import com.example.AgenciaTurismo.dto.response.ResponseDTO;
import com.example.AgenciaTurismo.service.IFlightService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1/flights")
public class FlightController {

    @Autowired
    IFlightService service;

    @GetMapping
    public ResponseEntity<List<FlightDTO>> traerTodosLosVuelos() {
        return new ResponseEntity<>(service.listarFlight(), HttpStatus.OK);
    }

    //US 0005:
    @GetMapping("/flights")
    public ResponseEntity<?> vuelosDisponibles(@RequestParam @Future(message = "La fecha de entrada debe ser en el futuro") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate dateFrom,
                                               @RequestParam @Future(message = "La fecha de salida debe ser en el futuro") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate dateTo,
                                               @RequestParam @NotBlank String origin,
                                               @RequestParam @NotBlank String destination){
        FlightConsultDTO datos = new FlightConsultDTO(dateFrom, dateTo, origin, destination);
        return new ResponseEntity<>(service.vuelosDisponibles(datos), HttpStatus.OK);
    }

    @PostMapping("/new")
    public ResponseEntity<ResponseDTO> crearFlight(@RequestBody @Valid FlightDTO flightDTO) {
        return new ResponseEntity<>(service.createFlight(flightDTO), HttpStatus.CREATED);
    }

    //UPDATE
    @PutMapping("/edit/{id}")
    public ResponseEntity<ResponseDTO> updateFlight(@PathVariable @NotNull Long id, @RequestBody @Valid FlightDTO flightDTO) {
        return new ResponseEntity<>(service.updateFlight(id, flightDTO), HttpStatus.OK);
    }

    //DELETE
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteFlights(@PathVariable @NotNull Long id) {
        return new ResponseEntity<>(service.deleteFlight(id), HttpStatus.OK);
    }
}
