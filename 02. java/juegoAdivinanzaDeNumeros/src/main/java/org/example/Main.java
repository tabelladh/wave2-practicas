package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero = (int) (Math.random() * 500);
        int intentos = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un num entre 1 y 500");

        try {
            int numIngresado = teclado.nextInt(); // El scanner debe estar dentro del try para controlar la excepcion de InputMismatchException
            if (numIngresado > 500 || numIngresado < 1) {
                throw new NotFoundException("¡Debes ingresar un numero entre 1 y 500!");
            }
            while (numIngresado != numero) {

                if (numIngresado < numero) {
                    System.out.println("El número random es " + numero + " y el"
                            + " ingresado debe ser mayor.");
                } else {
                    System.out.println("El número random es " + numero + " y el"
                            + " ingresado debe ser menor.");
                }
                intentos++;
                System.out.println("Ingrese otro numero entre 1 y 500");
                numIngresado = teclado.nextInt();
            }
            System.out.println("Acertaste el numero en " + intentos + " intentos");
        } catch (InputMismatchException e) { // catch para Tipo de dato distinto a el scanner
            System.out.println("debes ingresar un num entero");
        } catch (NotFoundException err) { //catch para una excepción personalizada
            System.out.println(err.getMessage());
        } finally {
            teclado.close();
        }
    }
}