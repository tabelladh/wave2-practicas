package com.example.MorseYRomanos.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MorseTraductor implements IMorseTraductor {
    String[] morseCodes = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };

    char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
            'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };
    public String traducirAMorse(String codigoMorse){
        // Dividir la cadena en sus elementos individuales
        String[] codigoArray = codigoMorse.split(" ");

        ArrayList<Character> traduccion = new ArrayList<>();
        for (String elemento : codigoArray) {
            int indice = -1;
            for (int i = 0; i < morseCodes.length; i++) {
                if (morseCodes[i].equals(elemento)) {
                    indice = i;
                    break;
                }
            }
            if (indice != -1 && indice < abecedario.length) {
                traduccion.add(abecedario[indice]);
            }
        }
        String resultado = "";
        for (char letra : traduccion) {
            resultado += letra;
        }

        // Mostrar las posiciones correspondientes encontradas
//        if (!traduccion.isEmpty()) {
//            System.out.println("La traduccion de {" + codigoMorse + "} es: " + resultado);
//            System.out.println(traduccion);
//        } else {
//            System.out.println("No se encontró ninguna coincidencia para '" + codigoMorse + ".");
//        }
        return resultado;
    }
    }

