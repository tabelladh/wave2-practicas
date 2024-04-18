package org.example;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto bruto del premio:");
        double montoBruto = scanner.nextDouble();

        double impuesto1 = montoBruto * 0.0245;
        double impuesto2 = montoBruto * 0.15;
        double impuesto3 = montoBruto * 0.03;

        double montoNeto = montoBruto - impuesto1 - impuesto2 - impuesto3;

        System.out.println("El monto neto del premio luego de aplicar los impuestos es: $" + montoNeto);
    }
}
