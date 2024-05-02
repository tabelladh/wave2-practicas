package com.example.morse.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class MorseServiceImpl implements MorseService {
    private static final Map<String, Character> morseALetraMap = new HashMap<>();

    static {
        morseALetraMap.put(".-", 'A');
        morseALetraMap.put("-...", 'B');
        morseALetraMap.put("-.-.", 'C');
        morseALetraMap.put("-..", 'D');
        morseALetraMap.put(".", 'E');
        morseALetraMap.put("..-.", 'F');
        morseALetraMap.put("--.", 'G');
        morseALetraMap.put("....", 'H');
        morseALetraMap.put("..", 'I');
        morseALetraMap.put(".---", 'J');
        morseALetraMap.put("-.-", 'K');
        morseALetraMap.put(".-..", 'L');
        morseALetraMap.put("--", 'M');
        morseALetraMap.put("-.", 'N');
        morseALetraMap.put("---", 'O');
        morseALetraMap.put(".--.", 'P');
        morseALetraMap.put("--.-", 'Q');
        morseALetraMap.put(".-.", 'R');
        morseALetraMap.put("...", 'S');
        morseALetraMap.put("-", 'T');
        morseALetraMap.put("..-", 'U');
        morseALetraMap.put("...-", 'V');
        morseALetraMap.put(".--", 'W');
        morseALetraMap.put("-..-", 'X');
        morseALetraMap.put("-.--", 'Y');
        morseALetraMap.put("--..", 'Z');
        // Dígitos
        morseALetraMap.put("-----", '0');
        morseALetraMap.put(".----", '1');
        morseALetraMap.put("..---", '2');
        morseALetraMap.put("...--", '3');
        morseALetraMap.put("....-", '4');
        morseALetraMap.put(".....", '5');
        morseALetraMap.put("-....", '6');
        morseALetraMap.put("--...", '7');
        morseALetraMap.put("---..", '8');
        morseALetraMap.put("----.", '9');
        // Caracteres especiales
        morseALetraMap.put(".-.-.-", '.');
        morseALetraMap.put("--..--", ',');
        morseALetraMap.put("..--..", '?');
        morseALetraMap.put("-.-.--", '!');
        morseALetraMap.put("-....-", '-');
        morseALetraMap.put(".-.-..", '"');
        morseALetraMap.put(".----.", '\'');
        morseALetraMap.put("-..-.", '/');
        morseALetraMap.put("-.--.", '(');
        morseALetraMap.put("-.--.-", ')');
        morseALetraMap.put(".-..-.", '&');
        morseALetraMap.put("---...", ':');
        morseALetraMap.put("-.-.-.", ';');
        morseALetraMap.put("-...-", '=');
        morseALetraMap.put(".-.-.", '+');
        morseALetraMap.put("-....-", '_');
        morseALetraMap.put("..--.-", '_');
        morseALetraMap.put(".-..-.", '$');
        morseALetraMap.put("...-..-", '@');
    }

    @Override
    public String translateToText(String morseCode) {
        StringBuilder result = new StringBuilder();
        String[] words = morseCode.trim().split("\\s{3,}"); // Separar palabras por tres o más espacios
        for (String word : words) {
            String[] letters = word.split("\\s+"); // Separar letras por uno o más espacios
            for (String letter : letters) {
                if (morseALetraMap.containsKey(letter)) {
                    result.append(morseALetraMap.get(letter));
                }
            }
            result.append(' '); // Agregar espacio entre palabras
        }
        return result.toString().trim(); // Eliminar espacio adicional al final y devolver el resultado
    }
}
