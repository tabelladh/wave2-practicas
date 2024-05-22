package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][3];

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese los números para la fila " + (i+1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print("Número " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[] resultados = new int[4];

        for (int i = 0; i < 4; i++) {
            int resultado = 1;
            for (int j = 0; j < 3; j++) {
                switch (i) {
                    case 0: // Suma
                        resultados[i] += matriz[i][j];
                        break;
                    case 1: // Resta
                        if (j == 0) {
                            resultados[i] = matriz[i][j];
                        } else {
                            resultados[i] -= matriz[i][j];
                        }
                        break;
                    case 2: // Multiplicación
                        resultado *= matriz[i][j];
                        resultados[i] = resultado;
                        break;
                    case 3: // División
                        if (j == 0) {
                            resultados[i] = matriz[i][j];
                        } else {
                            resultados[i] /= matriz[i][j];
                        }
                        break;
                }
            }
        }

        System.out.println("Ingrese el tipo de operación (0 para Suma, 1 para Resta, 2 para Multiplicación, 3 para División): ");
        int operacion = scanner.nextInt();

        try {
            System.out.println("El resultado de la operación es: " + resultados[operacion]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La operación seleccionada no es válida.");
        }
    }
}
