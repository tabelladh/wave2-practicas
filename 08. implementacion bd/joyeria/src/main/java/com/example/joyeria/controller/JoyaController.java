package com.example.joyeria.controller;

import com.example.joyeria.model.Joya;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.joyeria.service.JoyaServiceImpl;
import java.util.List;

@RestController
@RequestMapping("/jewerly")
public class JoyaController {

   @Autowired
   private JoyaServiceImpl joyaService;

   @PostMapping("/new")
   public ResponseEntity<Joya> crearJoya(@RequestBody Joya joya) {
      Joya joyaGuardada = joyaService.crearJoya(joya);
      return ResponseEntity.ok(joyaGuardada);
   }

   @GetMapping
   public ResponseEntity<List<Joya>> obtenerJoyas() {
      List<Joya> joyas = joyaService.obtenerJoyas();
      return ResponseEntity.ok(joyas);
   }

   @PutMapping("/delete/{id}")
   public ResponseEntity<Void> eliminarJoya(@PathVariable Long id) {
      joyaService.eliminarJoya(id);
      return ResponseEntity.ok().build();
   }

   @PutMapping("/update/{id}")
   public ResponseEntity<Joya> actualizarJoya(@PathVariable Long id, @RequestBody Joya joyaActualizada) {
      Joya joyaActualizadaGuardada = joyaService.actualizarJoya(id, joyaActualizada);
      return ResponseEntity.ok(joyaActualizadaGuardada);
   }
}
