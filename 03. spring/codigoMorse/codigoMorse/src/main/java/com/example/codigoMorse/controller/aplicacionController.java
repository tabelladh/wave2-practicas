package com.example.codigoMorse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicacionController {

    @GetMapping("/convertirMorse")
    public String traducirAMorse(String codigoMorse) {
        StringBuilder mensaje = new StringBuilder();
        String[] palabras = codigoMorse.split(" {3}");
        for (String palabra : palabras) {
            String[] letras = palabra.split(" ");
            for (String letra : letras) {
                switch (letra) {
                    case ".-":
                        mensaje.append("A");
                        break;
                    case "-...":
                        mensaje.append("B");
                        break;
                    case "-.-.":
                        mensaje.append("C");
                        break;
                    case "-..":
                        mensaje.append("D");
                        break;
                    case ".":
                        mensaje.append("E");
                        break;
                    case "..-.":
                        mensaje.append("F");
                        break;
                    case "--.":
                        mensaje.append("G");
                        break;
                    case "....":
                        mensaje.append("H");
                        break;
                    case "..":
                        mensaje.append("I");
                        break;
                    case ".---":
                        mensaje.append("J");
                        break;
                    case "-.-":
                        mensaje.append("K");
                        break;
                    case ".-..":
                        mensaje.append("L");
                        break;
                    case "--":
                        mensaje.append("M");
                        break;
                    case "-.":
                        mensaje.append("N");
                        break;
                    case "---":
                        mensaje.append("O");
                        break;
                    case ".--.":
                        mensaje.append("P");
                        break;
                    case "--.-":
                        mensaje.append("Q");
                        break;
                    case ".-.":
                        mensaje.append("R");
                        break;
                    case "...":
                        mensaje.append("S");
                        break;
                    case "-":
                        mensaje.append("T");
                        break;
                    case "..-":
                        mensaje.append("U");
                        break;
                    case "...-":
                        mensaje.append("V");
                        break;
                    case ".--":
                        mensaje.append("W");
                        break;
                    case "-..-":
                        mensaje.append("X");
                        break;
                    case "-.--":
                        mensaje.append("Y");
                        break;
                    case "--..":
                        mensaje.append("Z");
                        break;
                    case ".----":
                        mensaje.append("1");
                        break;
                    case "..---":
                        mensaje.append("2");
                        break;
                    case "...--":
                        mensaje.append("3");
                        break;
                    case "....-":
                        mensaje.append("4");
                        break;
                    case ".....":
                        mensaje.append("5");
                        break;
                    case "-....":
                        mensaje.append("6");
                        break;
                    case "--...":
                        mensaje.append("7");
                        break;
                    case "---..":
                        mensaje.append("8");
                        break;
                    case "----.":
                        mensaje.append("9");
                        break;
                    case "-----":
                        mensaje.append("0");
                        break;
                    default:
                        // Si no se reconoce el código, se deja el carácter original
                        mensaje.append(letra);
                        break;
                }
            }
            mensaje.append(" "); // Agregar espacio entre palabras
        }
        return mensaje.toString().trim(); // Eliminar espacio adicional al final y devolver el mensaje
    }

}
