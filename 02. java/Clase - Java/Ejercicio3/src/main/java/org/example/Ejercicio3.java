package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de días de la campaña:");
        int dias = scanner.nextInt();
        double costoTotal = dias * 2;
        System.out.println("El costo total de la campaña es: $" + costoTotal);

    }
}
