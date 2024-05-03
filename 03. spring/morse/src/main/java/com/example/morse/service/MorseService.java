package com.example.morse.service;

import com.example.morse.model.Morse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MorseService implements IService {

    private final Morse morse;

    @Override
    public String traductor (String texto){
        texto = texto.toUpperCase();
        StringBuilder morseCode = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == ' ') {
                morseCode.append("   ");
            } else if (Character.isLetter(c)) {
                morseCode.append(toMorse(c) + " ");
               }
            }
        return morseCode.toString().trim();
        }

    @Override
    public String toMorse(char c) {
        char[] alfabeto = morse.getAlfabeto();
        String[] alfabetoMorse = morse.getAlfabetoMorse();
        String morseCode = "";

        for (int i = 0; i < alfabeto.length; i++) {
            if (alfabeto[i] == c) {
                morseCode = alfabetoMorse[i];
            }
        }
        if (morseCode.isEmpty()) {
            morseCode = "?";
        }

        return morseCode;
    }

}

