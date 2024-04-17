package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un sueldo");
        double sueldo = teclado.nextDouble();

        if (sueldo <= 20000) {
            System.out.println("El sueldo que le corresponde es " + sueldo * 1.20);
        } else if (sueldo > 20000 && sueldo <= 45000) {
            System.out.println("El sueldo que le corresponde es " + sueldo * 1.10);
        } else {
            System.out.println("El sueldo que le corresponde es " + sueldo * 1.05);
        }
        sueldo.close();

    }
}