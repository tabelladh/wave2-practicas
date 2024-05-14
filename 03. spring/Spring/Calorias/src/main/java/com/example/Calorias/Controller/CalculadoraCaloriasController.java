package com.example.Calorias.Controller;

import com.example.Calorias.DTO.Ingrediente;
import com.example.Calorias.DTO.Plato;
import com.example.Calorias.Service.CalculadoraCaloriasService;
import com.example.Calorias.Util.JsonReader;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/calorias")
public class CalculadoraCaloriasController {

    private final CalculadoraCaloriasService service;
    private final JsonReader jsonReader;

    public CalculadoraCaloriasController(CalculadoraCaloriasService service, JsonReader jsonReader) {
        this.service = service;
        this.jsonReader = jsonReader;
    }

    @GetMapping("/plato")
    public double calcularCaloriasTotales(@RequestBody Plato plato) {
        return service.calcularCaloriasTotales(plato);
    }

    @GetMapping("/plato/{platoId}/ingredientes/{ingredienteId}")
    public double calcularCaloriasPorIngrediente(@PathVariable String platoId, @PathVariable String ingredienteId) throws IOException {
        Plato plato = new Plato();
        Ingrediente ingrediente = plato.getIngredientes().stream()
                .filter(i -> i.getNombre().equals(ingredienteId))
                .findFirst()
                .orElse(null);
        if (ingrediente == null) {
            throw new IllegalArgumentException("Ingrediente no encontrado en el plato");
        }
        return service.calcularCaloriasPorIngrediente(ingrediente);
    }

    @GetMapping("/masCalorico")
    public Ingrediente masCalorico() throws IOException {
        List<Ingrediente> ingredientes = jsonReader.readIngredientesFromJson("src/main/resources/food.json");
        if (ingredientes.isEmpty()) {
            throw new IllegalArgumentException("No se encontraron ingredientes");
        }
        return service.encontrarIngredienteMasCalorico(ingredientes);
    }



}

