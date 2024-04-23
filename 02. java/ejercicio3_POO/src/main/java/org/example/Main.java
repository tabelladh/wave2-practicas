package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAdivinar = (int) (Math.random() * 500) + 1;
        int intentos = 0;


        System.out.println("¡Bienvenido al juego de adivinanza de números!");
        System.out.println("Se ha generado un número aleatorio entre 1 y 500.");
        System.out.println("El numero es: " + numeroAdivinar);


        while (true) {
            try {
                System.out.print("Ingresa un número: ");
                int numeroUsuario = scanner.nextInt();


                if (numeroUsuario < 1 || numeroUsuario > 500) {
                    throw new NumeroFueraDeRangoException("El número ingresado está fuera del rango permitido.");
                }


                if (numeroUsuario == numeroAdivinar) {
                    System.out.println(
                            "¡Felicidades! Has adivinado el número correctamente en " + intentos + " intentos.");
                    break;
                } else if (numeroUsuario < numeroAdivinar) {
                    System.out.println("El número ingresado es menor que el número a adivinar. ¡Sigue intentando!");
                    intentos++;
                } else {
                    System.out.println("El número ingresado es mayor que el número a adivinar. ¡Sigue intentando!");
                    intentos++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número entero válido.");
                scanner.nextLine();
            } catch (NumeroFueraDeRangoException e) {
                System.out.println("Error: " + e.getMessage());


            }
        }


        scanner.close();
    }
}