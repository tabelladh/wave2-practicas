package com.example.convertidorRomano.model;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class NumeroRomano {


    private int[] valorDecimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private String[] valorRomano = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

}
