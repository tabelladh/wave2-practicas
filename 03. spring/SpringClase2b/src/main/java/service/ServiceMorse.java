package service;



    import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

    @Service
    public class ServiceMorse implements IServiceMorse {

        private static final Map<String, String> MORSE_TO_TEXT = new HashMap<>();

        static {
            MORSE_TO_TEXT.put(".-", "A");
            MORSE_TO_TEXT.put("-...", "B");
            MORSE_TO_TEXT.put("-.-.", "C");
            MORSE_TO_TEXT.put("-..", "D");
            MORSE_TO_TEXT.put(".", "E");
            MORSE_TO_TEXT.put("..-.", "F");
            MORSE_TO_TEXT.put("--.", "G");
            MORSE_TO_TEXT.put("....", "H");
            MORSE_TO_TEXT.put("..", "I");
            MORSE_TO_TEXT.put(".---", "J");
            MORSE_TO_TEXT.put("-.-", "K");
            MORSE_TO_TEXT.put(".-..", "L");
            MORSE_TO_TEXT.put("--", "M");
            MORSE_TO_TEXT.put("-.", "N");
            MORSE_TO_TEXT.put("---", "O");
            MORSE_TO_TEXT.put(".--.", "P");
            MORSE_TO_TEXT.put("--.-", "Q");
            MORSE_TO_TEXT.put(".-.", "R");
            MORSE_TO_TEXT.put("...", "S");
            MORSE_TO_TEXT.put("-", "T");
            MORSE_TO_TEXT.put("..-", "U");
            MORSE_TO_TEXT.put("...-", "V");
            MORSE_TO_TEXT.put(".--", "W");
            MORSE_TO_TEXT.put("-..-", "X");
            MORSE_TO_TEXT.put("-.--", "Y");
            MORSE_TO_TEXT.put("--..", "Z");
            MORSE_TO_TEXT.put("-----", "0");
            MORSE_TO_TEXT.put(".----", "1");
            MORSE_TO_TEXT.put("..---", "2");
            MORSE_TO_TEXT.put("...--", "3");
            MORSE_TO_TEXT.put("....-", "4");
            MORSE_TO_TEXT.put(".....", "5");
            MORSE_TO_TEXT.put("-....", "6");
            MORSE_TO_TEXT.put("--...", "7");
            MORSE_TO_TEXT.put("---..", "8");
            MORSE_TO_TEXT.put("----.", "9");
        }

        @Override
        public String morseATexto(String morseCode) {
            String[] palabras = morseCode.trim().split("   "); // Palabras separadas por 3 espacios
            StringBuilder resultado = new StringBuilder();

            for (String palabra : palabras) {
                String[] caracteres = palabra.split(" "); // Caracteres separados por un espacio
                for (String caracter : caracteres) {
                    String letra = MORSE_TO_TEXT.get(caracter);
                    if (letra != null) {
                        resultado.append(letra);
                    } else {
                        resultado.append("?");
                    }
                }
                resultado.append(" "); // Separador de palabras
            }

            return resultado.toString().trim(); // Eliminar el último espacio
        }
    }

