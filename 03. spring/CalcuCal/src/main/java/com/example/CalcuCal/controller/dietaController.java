package com.example.CalcuCal.controller;

import com.example.CalcuCal.dto.request.PlatoDTO;
import com.example.CalcuCal.dto.response.RespuestaDTO;
import com.example.CalcuCal.service.IIngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dieta")
public class dietaController {

    @Autowired
    IIngredienteService ingredienteService;

    @GetMapping("/retornarCaloriasTotales")
    public ResponseEntity<RespuestaDTO> retornarCaloriasTotales(@RequestBody PlatoDTO platoDTO) {
        return new ResponseEntity<>(ingredienteService.retornarCaloriasTotales(platoDTO), HttpStatus.OK);

    }


}
