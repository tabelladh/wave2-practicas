package com.example.CalcuCalorias.controller;

import com.example.CalcuCalorias.dto.request.PlatoDTO;
import com.example.CalcuCalorias.service.IIngredientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dieta")
public class dietaController {

    @Autowired
    private IIngredientesService ingredientesService;

    @GetMapping("/caloriasTotales")
    public ResponseEntity<?> caloriasTotales(@RequestBody PlatoDTO platoDTO){
        return new ResponseEntity<>(ingredientesService.retornarCaloriasTotales(platoDTO), HttpStatus.OK);
    }

    @GetMapping("/caloriasTotalesPorIngrediente")
    public ResponseEntity<?> caloriasTotalesPorIngrediente(@RequestBody PlatoDTO platoDTO){
        return new ResponseEntity<>(ingredientesService.retornarCaloriasTotalesPorIngrediente(platoDTO), HttpStatus.OK);
    }

    @GetMapping("/ingredienteConMasCalorias")
    public ResponseEntity<?> ingredienteConMasCalorias(@RequestBody PlatoDTO platoDTO){
        return new ResponseEntity<>(ingredientesService.retornarIngredienteConMasCalorias(platoDTO), HttpStatus.OK);
    }

}