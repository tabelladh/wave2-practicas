package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ingresar costo del producto");
        Scanner teclado = new Scanner(System.in);
        int costo = teclado.nextInt();

        System.out.println("Ingresar el num de empresa");
        int empresa = teclado.nextInt();

        double precioFinal = 0;

        switch (empresa) {
            case 1:
                precioFinal = costo * 1.07 * 1.25;
                System.out.println(precioFinal);
                break;
            case 2:
                precioFinal = costo * 1.15 * 1.25;
                System.out.println (precioFinal);
                break;
            case 3:
                precioFinal = costo * 1.22 * 1.25;
                System.out.println(precioFinal);
                break;
            default:
                System.out.println("No existe la fabrica");
        }
        teclado.close();
    }
}