package com.example.numerosRomanos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class numRest {
    @GetMapping("/convertir")
    public String convertirARomano(Integer num) {
        if (num <= 0 || num > 3999) {
            return "Número fuera de rango";
        }

        StringBuilder roman = new StringBuilder();
        int[] decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < decimalValues.length; i++) {
            while (num >= decimalValues[i]) {
                roman.append(romanNumerals[i]);
                num -= decimalValues[i];
            }
        }

        return roman.toString();
    }


    }
