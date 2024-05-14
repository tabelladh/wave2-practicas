package org.example;

public class DecimalARomano {
    public static String decimalARomano(int numero) {
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < valores.length; i++) {
            while (numero >= valores[i]) {
                resultado.append(romanos[i]);
                numero -= valores[i];
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        int numeroDecimal = 9;
        System.out.println("El número decimal " + numeroDecimal + " en números romanos es: " + decimalARomano(numeroDecimal));
    }
}
