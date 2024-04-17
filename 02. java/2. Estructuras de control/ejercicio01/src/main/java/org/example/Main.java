package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int numFabrica = 0;
        double costoProd = 0, porcentajeEnvio = 0, ganancia = 0.25 , precioVenta = 0;

        System.out.print("Ingrese el costo del producto: ");
        Scanner sc = new Scanner(System.in);
        costoProd = sc.nextDouble();

        System.out.print("Ingrese el numero de fábrica: ");
        numFabrica = sc.nextInt();

        switch (numFabrica) {
            case 1 -> porcentajeEnvio = 0.07;
            case 2 -> porcentajeEnvio = 0.15;
            case 3 -> porcentajeEnvio = 0.22;
            default -> System.out.println("Número de fábrica inválido.");
        }

        precioVenta = costoProd + (costoProd * porcentajeEnvio);

        System.out.println("El importe de venta es: $ " +( precioVenta + (precioVenta * ganancia)));

        sc.close();
    }
}