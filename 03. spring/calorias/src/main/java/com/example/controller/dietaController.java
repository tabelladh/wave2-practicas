package com.example.controller;

import com.example.dto.request.PlatoDTO;
import com.example.dto.response.IngredientePorCaloriasYPesoDTO;
import com.example.dto.response.RespuestaDTO;
import com.example.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dieta")
public class dietaController {

   @Autowired
   private IngredienteService ingredienteService;

   @GetMapping("/caloriasTotales")
   public ResponseEntity<RespuestaDTO> retornarCaloriasTotales(@RequestBody PlatoDTO platoDTO) {
      return new ResponseEntity<>(ingredienteService.retornarCaloriasTotales(platoDTO), HttpStatus.OK);
   }

   @GetMapping("/caloriasPorIngrediente")
   public ResponseEntity<List<IngredientePorCaloriasYPesoDTO>> retornarCaloriasPorIngrediente(@RequestBody PlatoDTO platoDTO) {
      return new ResponseEntity<>(ingredienteService.retornarCaloriasPorIngrediente(platoDTO), HttpStatus.OK);
   }

   @GetMapping("/masCalorico")
   public ResponseEntity<RespuestaDTO> retornarIngredienteConMasCalorias(@RequestBody PlatoDTO platoDTO) {
      return new ResponseEntity<>(ingredienteService.encontrarIngredienteConMasCalorias(platoDTO), HttpStatus.OK);
   }
}