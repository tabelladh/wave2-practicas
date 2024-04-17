package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        double precioCosto = scanner.nextDouble();

        System.out.println("Ingrese la fábrica :");
        int fabrica = scanner.nextInt();

        double costoEnvio;

        switch (fabrica) {
            case 1:
                costoEnvio = (precioCosto * 0.07);
                break;
            case 2:
                costoEnvio = (precioCosto * 0.15);
                break;
            case 3:
                costoEnvio = (precioCosto * 0.22);
                break;
            default:
                costoEnvio = 0;
                break;
        }

        double porcentajeGanancia = 1.25;
        double precioVenta = (precioCosto + costoEnvio) * porcentajeGanancia;

        System.out.println("Precio de venta: $" + precioVenta);

        scanner.close();
    }
}
