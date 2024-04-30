package org.example;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresar precio del producto: ");
        double precioProducto = scanner.nextDouble();


        System.out.print("Ingrese la Fabrica (1, 2 o 3): ");
        int fabrica = scanner.nextInt();

        double porcentajeEnvio;


        if (fabrica == 1) {
            porcentajeEnvio = 0.07;
        } else if (fabrica == 2) {
            porcentajeEnvio = 0.15;
        } else if (fabrica == 3) {
            porcentajeEnvio = 0.22;
        } else {
            System.out.println("Fabrica inexistente.");
            return;
        }


        double costoEnvio = precioProducto * porcentajeEnvio;


        double precioFinal = precioProducto + costoEnvio + (precioProducto * 0.25);

        System.out.println("Precio de venta: $" + precioFinal);
    }

}
