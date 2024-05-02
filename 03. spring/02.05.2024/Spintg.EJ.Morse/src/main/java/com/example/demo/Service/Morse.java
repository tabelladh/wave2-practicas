package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class Morse implements ITraduceMorse {


    public String traducirMorse(String morse)
    {
        String[] morseWords = morse.split("   "); // Separar palabras
        StringBuilder result = new StringBuilder();

        // Definir un mapa de caracteres Morse
        String[] morseLetters = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        // Definir caracteres correspondientes al alfabeto
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        for (String morseWord : morseWords) {
            String[] morseChars = morseWord.split(" "); // Separar caracteres
            for (String morseChar : morseChars) {
                for (int i = 0; i < morseLetters.length; i++) {
                    if (morseChar.equals(morseLetters[i])) {
                        result.append(alphabet[i]);
                        break;
                    }
                }
            }
            result.append(" "); // Agregar espacio entre palabras
        }

        return result.toString().trim(); // Eliminar espacios al inicio y final
    }

    }

