package com.example.convertidorRomano.service;

import com.example.convertidorRomano.model.NumeroRomano;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NumeroRomanoService {

    private final NumeroRomano numeroRomano;

    public String convertToRoman(int number) {
        StringBuilder roman = new StringBuilder();
        int[] valorDecimal = numeroRomano.getValorDecimal();
        String[] valorRomano = numeroRomano.getValorRomano();

        for (int i = 0; i < valorDecimal.length; i++) {
            while (number >= valorDecimal[i]) {
                roman.append(valorRomano[i]);
                number -= valorDecimal[i];
            }
        }

        return roman.toString();
    }

}
