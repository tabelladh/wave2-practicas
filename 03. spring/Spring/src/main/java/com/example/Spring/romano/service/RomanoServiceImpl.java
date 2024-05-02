package com.example.romano.service;

import org.springframework.stereotype.Service;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class RomanoServiceImpl implements RomanoService {

    private static final Map<Integer, String> decimalToRomanMap = new LinkedHashMap<>();

    static {
        decimalToRomanMap.put(1000, "M");
        decimalToRomanMap.put(900, "CM");
        decimalToRomanMap.put(500, "D");
        decimalToRomanMap.put(400, "CD");
        decimalToRomanMap.put(100, "C");
        decimalToRomanMap.put(90, "XC");
        decimalToRomanMap.put(50, "L");
        decimalToRomanMap.put(40, "XL");
        decimalToRomanMap.put(10, "X");
        decimalToRomanMap.put(9, "IX");
        decimalToRomanMap.put(5, "V");
        decimalToRomanMap.put(4, "IV");
        decimalToRomanMap.put(1, "I");
    }

    @Override
    public String convertToRoman(int number) {
        StringBuilder romanNumber = new StringBuilder();
        for (Map.Entry<Integer, String> entry : decimalToRomanMap.entrySet()) {
            int decimal = entry.getKey();
            String roman = entry.getValue();
            while (number >= decimal) {
                romanNumber.append(roman);
                number -= decimal;
            }
        }
        return romanNumber.toString();
    }
}
