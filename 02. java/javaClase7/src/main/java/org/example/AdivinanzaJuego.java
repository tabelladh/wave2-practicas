package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinanzaJuego {

    public static void main(String[] args) {
        // Método principal que llama al juego
        jugarJuego();
    }

    // Método para jugar al juego de adivinanzas
    public static void jugarJuego() {
        // Generar un número aleatorio para adivinar
        int numeroAdivinar = (int) (Math.random() * 500) + 1;
        int intentos = 0; // Contador de intentos
        Scanner scanner = new Scanner(System.in);

        // Mensaje de bienvenida
        System.out.println("¡Bienvenido al juego de adivinanzas de número!");
        System.out.println("Adivina el número entre 1 y 500.");

        try {
            // Obtener el número ingresado por el usuario
            int numeroUsuario = scanner.nextInt();
            intentos++; // Incrementar el contador de intentos

            // Verificar si el número está dentro del rango
            if (numeroUsuario < 1 || numeroUsuario > 500) {
                throw new NumeroFueraDeRangoException("El número ingresado está fuera del rango permitido (1 - 500).");
            }

            if (numeroUsuario == numeroAdivinar) {
                System.out.println("¡Felicidades! ¡Has adivinado el número " + numeroAdivinar + " en " + intentos + " intentos!");
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor.");
                jugarJuego(); // Llamada recursiva si el número es menor
            } else {
                System.out.println("El número a adivinar es menor.");
                jugarJuego(); // Llamada recursiva si el número es mayor
            }
        } catch (InputMismatchException e) {

            System.out.println("Error: Debes ingresar un número entero.");
            scanner.next(); // Limpiar el buffer del scanner
            jugarJuego(); // Llamada recursiva
        } catch (NumeroFueraDeRangoException e) {

            System.out.println("Error: " + e.getMessage());
            jugarJuego(); // Llamada recursiva
        }

        scanner.close(); // Cerrar el scanner
    }


    static class NumeroFueraDeRangoException extends Exception {
        public NumeroFueraDeRangoException(String mensaje) {
            super(mensaje);
        }
    }
}
