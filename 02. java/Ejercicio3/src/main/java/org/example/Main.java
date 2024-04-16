package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int servicio;
        for (int i = 1 ; i < 8 ; i++) {
            System.out.println("Bienvenido cliente " + i);
            System.out.println("Elija su servicio: ");

            servicio = scanner.nextInt();

            if(servicio == 1) {
                System.out.println("El cliente " + i + " debe abonar $" + 1500);
            } else if (servicio == 2) {
                System.out.println("El cliente " + i + " debe abonar $" + 2200);
            } else {
                System.out.println("Por favor ingrese un servicio valido!");
            }

        }
        scanner.close();

    }
}