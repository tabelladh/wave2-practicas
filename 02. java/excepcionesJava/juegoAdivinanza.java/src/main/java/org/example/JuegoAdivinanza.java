package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoAdivinanza {

    public static void main(String[] args) {
        int numeroAdivinar = (int) (Math.random() * 500) + 1;
        int intentos = 0;

        System.out.println("¡Bienvenido al juego de adivinanza de números!");
        System.out.println("Adivina el número en el rango de 1 a 500.");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Ingresa un número: ");
            try {
                int numeroUsuario = scanner.nextInt();
                intentos++;

                if (numeroUsuario < 1 || numeroUsuario > 500) {
                    throw new NumeroFueraDeRangoException("El número ingresado está fuera del rango.");
                }

                if (numeroUsuario == numeroAdivinar) {
                    System.out.println("¡Felicidades! ¡Adivinaste el número " + numeroAdivinar + " en " + intentos + " intentos!");
                    break;
                } else if (numeroUsuario < numeroAdivinar) {
                    System.out.println("Intenta con uno mayor.");
                } else {
                    System.out.println("Intenta con uno menor.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero.");
                scanner.next();
            } catch (NumeroFueraDeRangoException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }

    static class NumeroFueraDeRangoException extends Exception {
        public NumeroFueraDeRangoException(String message) {
            super(message);
        }
    }
}
