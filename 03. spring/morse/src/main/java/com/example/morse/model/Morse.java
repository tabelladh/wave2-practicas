package com.example.morse.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Morse {

    private final String[] alfabetoMorse = {".-", "-...", "-.-.", "-..", ".",
            "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--",
            "-.", "---", ".--.", "--.-",
            ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--",
            "--.."};
    private final char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z'};

}
