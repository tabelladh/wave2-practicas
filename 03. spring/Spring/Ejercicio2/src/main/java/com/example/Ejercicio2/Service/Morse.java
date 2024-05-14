package com.example.Ejercicio2.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Morse implements IMorse {

    private static final Map<String, String> mapaMorse = new HashMap<>();

    static {
        mapaMorse.put(".-", "A");
        mapaMorse.put("-...", "B");
        mapaMorse.put("-.-.", "C");
        mapaMorse.put("-..", "D");
        mapaMorse.put(".", "E");
        mapaMorse.put("..-.", "F");
        mapaMorse.put("--.", "G");
        mapaMorse.put("....", "H");
        mapaMorse.put("..", "I");
        mapaMorse.put(".---", "J");
        mapaMorse.put("-.-", "K");
        mapaMorse.put(".-..", "L");
        mapaMorse.put("--", "M");
        mapaMorse.put("-.", "N");
        mapaMorse.put("---", "O");
        mapaMorse.put(".--.", "P");
        mapaMorse.put("--.-", "Q");
        mapaMorse.put(".-.", "R");
        mapaMorse.put("...", "S");
        mapaMorse.put("-", "T");
        mapaMorse.put("..-", "U");
        mapaMorse.put("...-", "V");
        mapaMorse.put(".--", "W");
        mapaMorse.put("-..-", "X");
        mapaMorse.put("-.--", "Y");
        mapaMorse.put("--..", "Z");
        mapaMorse.put(".----", "1");
        mapaMorse.put("..---", "2");
        mapaMorse.put("...--", "3");
        mapaMorse.put("....-", "4");
        mapaMorse.put(".....", "5");
        mapaMorse.put("-....", "6");
        mapaMorse.put("--...", "7");
        mapaMorse.put("---..", "8");
        mapaMorse.put("----.", "9");
        mapaMorse.put("-----", "0");
    }

    public String traducirCodigoMorse(String codigoMorse) {
        StringBuilder traduccion = new StringBuilder();
        String[] palabras = codigoMorse.split("   ");

        for (String palabra : palabras) {
            String[] letras = palabra.split(" ");
            for (String letra : letras) {
                if (mapaMorse.containsKey(letra)) {
                    traduccion.append(mapaMorse.get(letra));
                } else {
                    traduccion.append("?");
                }
            }
            traduccion.append(" ");
        }
        return traduccion.toString().trim();
    }
}
