package com.example.morse.controller;

import com.example.morse.service.MorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {
    private final MorseService morseService;

    @Autowired
    public MorseController(MorseService morseService) {
        this.morseService = morseService;
    }

    @GetMapping("/translate/{morseCode}")
    public String translateToText(@PathVariable String morseCode) {
        return morseService.translateToText(morseCode);
    }
}