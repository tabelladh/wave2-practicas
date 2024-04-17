package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int montoFinal = 0;


        for (int i = 1; i <= 7; i++) {
            if (i == 1 || i == 5 || i == 6 || i == 7) {
                montoFinal = 1500;

            } else if (i == 2 || i == 3 || i == 4) {
                montoFinal = 2200;

            }
            System.out.println("Su nro de cliente es " + i + "y su monto final de factura es: " + montoFinal + " al mes");
        }


    }


}

