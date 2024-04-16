package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Precio de costo: ");
        Scanner scanner = new Scanner(System.in);
        double costoInicial = scanner.nextDouble();
        System.out.println("Fabrica Numero: ");
        int numFabrica = scanner.nextInt();
        scanner.close();

        int envio;
        int ganancia = 25;
        double totalEnvio;
        double totalVenta;

        switch (numFabrica) {
            case 1:
                envio = 7;
                totalEnvio = costoInicial + ((costoInicial * envio) / 100);
                totalVenta = totalEnvio + ((totalEnvio * ganancia) / 100);
                System.out.println("Precio de venta: " + String.format("$%.2f", totalVenta));
                break;
            case 2:
                envio = 15;
                totalEnvio = costoInicial + ((costoInicial * envio) / 100);
                totalVenta = totalEnvio + ((totalEnvio * ganancia) / 100);
                System.out.println("Precio de venta: " + String.format("$%.2f", totalVenta));
                break;
            case 3:
                envio = 22;
                totalEnvio = costoInicial + ((costoInicial * envio) / 100);
                totalVenta = totalEnvio + ((totalEnvio * ganancia) / 100);
                System.out.println("Precio de venta: " + String.format("$%.2f", totalVenta));
                break;

        }




    }
}