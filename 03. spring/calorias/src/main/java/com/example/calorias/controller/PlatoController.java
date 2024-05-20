package com.example.calorias.controller;

import com.example.calorias.dto.req.PlatoDto;
import com.example.calorias.dto.res.RespuestaDto;
import com.example.calorias.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlatoController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping("/plato")
    ResponseEntity<RespuestaDto> caloriasTotales(@RequestParam PlatoDto platoDto){
        return new ResponseEntity<>(ingredientService.getCaloriesByDish(platoDto), HttpStatus.OK) ;
    }

}
