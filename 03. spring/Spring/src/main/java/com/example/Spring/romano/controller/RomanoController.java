package com.example.romano.controller;

import com.example.romano.service.RomanoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanoController {

    private final RomanoService romanoService;

    public RomanoController(RomanoService romanoService) {
        this.romanoService = romanoService;
    }

    @GetMapping("/romano/{number}")
    public String convertToRoman(@PathVariable int number) {
        return romanoService.convertToRoman(number);
    }
}