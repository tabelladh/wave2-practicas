package com.example.AgenciaTurismo.controller;


import com.example.AgenciaTurismo.dto.FlightDTO;
import com.example.AgenciaTurismo.dto.TouristicPackageDTO;
import com.example.AgenciaTurismo.dto.response.ResponseDTO;
import com.example.AgenciaTurismo.service.ITouristicPackageService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TouristicPackageController {
    @Autowired
    ITouristicPackageService service;

    @PostMapping("/touristicpackage/hotel/new")
    public ResponseEntity<ResponseDTO> crearPaqueteHotel(@RequestBody TouristicPackageDTO paquete){
        return new ResponseEntity<>(service.createPackageHotel(paquete), HttpStatus.CREATED);
    }
    @PostMapping("/touristicpackage/flight/new")
    public ResponseEntity<ResponseDTO> crearPaqueteVuelo(@RequestBody TouristicPackageDTO paquete){
        return new ResponseEntity<>(service.createPackageVuelo(paquete), HttpStatus.CREATED);
    }
//
//    //UPDATE
//    @PutMapping("/edit/{id}")
//    public ResponseEntity<ResponseDTO> updateFlight(@PathVariable @NotNull Long id, @RequestBody @Valid FlightDTO flightDTO) {
//        return new ResponseEntity<>(service.updateFlight(id, flightDTO), HttpStatus.OK);
//    }
//
//    //DELETE
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<ResponseDTO> deleteFlights(@PathVariable @NotNull Long id) {
//        return new ResponseEntity<>(service.deleteFlight(id), HttpStatus.OK);
    }

