package com.example.Sprint1Equipo4.controller;

import com.example.Sprint1Equipo4.dto.request.FlightReqDto;
import com.example.Sprint1Equipo4.dto.response.FlightDTO;
import com.example.Sprint1Equipo4.dto.response.FlightResDto;
import com.example.Sprint1Equipo4.dto.response.HotelDTO;
import com.example.Sprint1Equipo4.exception.MissingParameterException;

import com.example.Sprint1Equipo4.model.Flight;
import com.example.Sprint1Equipo4.dto.response.ResponseFlightDTO;
import com.example.Sprint1Equipo4.service.FlightService;
import com.example.Sprint1Equipo4.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1")

public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("/flight")
    public ResponseEntity<List<FlightDTO>> listFlight(
            @DateTimeFormat(pattern = "dd/MM/yyyy") @RequestParam(required = false) LocalDate date_from,
            @DateTimeFormat(pattern = "dd/MM/yyyy") @RequestParam(required = false) LocalDate date_to,
            @RequestParam(required = false) String origin,
            @RequestParam(required = false) String destination) {

       boolean paramsPresent = (date_from != null || date_to != null || origin != null || destination != null);

        if (paramsPresent) {
            if (date_from == null || date_to == null || origin == null || destination == null) {
                throw new MissingParameterException();
            }

            flightService.validateDateRangeFlight(date_from, date_to, destination);

            List<FlightDTO> flightsAvailable = flightService.flightsAvailable(date_from, date_to, origin, destination);

            if (flightsAvailable.isEmpty()) {
                throw new NullPointerException();
            }
            return new ResponseEntity<>(flightsAvailable, HttpStatus.OK);
        } else {
            List<FlightDTO> allFlights = flightService.listFlights();
            if (allFlights.isEmpty()) {
                throw new NullPointerException();
            }
            return new ResponseEntity<>(allFlights, HttpStatus.OK);
        }
    }

    @GetMapping("/flight/{name}")
    public ResponseEntity<FlightDTO> findByFlightName(@PathVariable String name) {
        FlightDTO flightDTO = flightService.findByFlightName(name);
        return new ResponseEntity<>(flightDTO, HttpStatus.OK);
    }

    @DeleteMapping("/flight/{name}")
    public ResponseEntity<ResponseFlightDTO> deleteFlight(@PathVariable String name) {
        return new ResponseEntity<>(flightService.deleteFlight(name), HttpStatus.OK);
    }

    @PostMapping("/flight-reservation")
    public ResponseEntity<FlightResDto> reserve(@RequestBody FlightReqDto flightReqDto) {
        return new ResponseEntity<>(flightService.reserve(flightReqDto), HttpStatus.CREATED);
    }

    @PostMapping("/flight")
    public ResponseEntity<Flight> create(@RequestBody FlightDTO flightDTO) {
        return new ResponseEntity<>(flightService.create(flightDTO), HttpStatus.CREATED);
    }

    @PutMapping("/flight/{name}")
    public ResponseEntity<Flight> upDate(@RequestBody FlightDTO flightDTO, @PathVariable String name) {
        return new ResponseEntity<>(flightService.upDate(flightDTO), HttpStatus.OK);
    }

}


