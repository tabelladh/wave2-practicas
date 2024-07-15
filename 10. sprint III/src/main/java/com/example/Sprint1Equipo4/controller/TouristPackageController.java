package com.example.Sprint1Equipo4.controller;

import com.example.Sprint1Equipo4.model.TouristPackage;
import com.example.Sprint1Equipo4.service.TouristPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/touristicpackage")
public class TouristPackageController {

    @Autowired
    private TouristPackageService service;

    @PostMapping("/new")
    public ResponseEntity<String> createPackage(@RequestBody TouristPackage paquete) {
        service.createPackage(paquete);
        return new ResponseEntity<>("Paquete Turístico dado de alta correctamente", HttpStatus.OK);
    }

    @PutMapping("/edit")
    public ResponseEntity<String> updatePackage(@RequestParam Long packageNumber, @RequestBody TouristPackage paquete) {
        service.updatePackage(packageNumber, paquete);
        return new ResponseEntity<>("Paquete Turístico modificado correctamente", HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<TouristPackage>> getAllPackages() {
        return new ResponseEntity<>(service.getAllPackages(), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deletePackage(@RequestParam Long packageNumber) {
        service.deletePackage(packageNumber);
        return new ResponseEntity<>("Paquete Turístico dado de baja correctamente", HttpStatus.OK);
    }
}
