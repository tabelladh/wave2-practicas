package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Random random = new Random();
            int numeroRandom = random.nextInt(500) + 1;
            System.out.println("---------Tienes diez intentos para adivinar-----------");
            int intentos = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println("Ingrese un número de 1 al 500");
                Scanner teclado = new Scanner(System.in);
                try {
                    int numeroIngresado = teclado.nextInt();
                    if (numeroIngresado < 1 || numeroIngresado > 500) {
                        System.out.println("El número ingresado debe estar entre 1 y 500.");
                        continue;
                    }
                    intentos++;
                    if (numeroIngresado > numeroRandom) {
                        System.out.println("Es más chico");
                    } else if (numeroIngresado < numeroRandom) {
                        System.out.println("Es más grande");
                    } else if (numeroIngresado == numeroRandom) {
                        System.out.println("¡ADIVINASTE! Te tomó " + intentos + " intentos");
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, ingrese un número válido.");
                    teclado.next();
                }
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        }
    }
}