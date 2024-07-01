package com.example.Joyeria.Controller;


import com.example.Joyeria.Model.Jewel;
import com.example.Joyeria.Service.JewelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jewelry")
public class JewelController {

    @Autowired
    private JewelService jewelService;

    @PostMapping("/new")
    public ResponseEntity<String> createJewel(@RequestBody Jewel jewel) {
        Jewel createdJewel = jewelService.createJewel(jewel);
        return ResponseEntity.ok("Joya creada con ID: " + createdJewel.getId());
    }

    @GetMapping
    public List<Jewel> getAllJewels() {
        return jewelService.getAllJewels();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jewel> getJewelById(@PathVariable Long id) {
        Jewel jewel = jewelService.getJewelById(id);
        return ResponseEntity.ok(jewel);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Jewel> updateJewel(@PathVariable Long id, @RequestBody Jewel jewelDetails) {
        Jewel updatedJewel = jewelService.updateJewel(id, jewelDetails);
        return ResponseEntity.ok(updatedJewel);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteJewel(@PathVariable Long id) {
        jewelService.deleteJewel(id);
        return ResponseEntity.ok("Joya con ID " + id + " eliminada");
    }
}

