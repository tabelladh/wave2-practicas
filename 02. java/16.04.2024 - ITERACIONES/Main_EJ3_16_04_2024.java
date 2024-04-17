package org.example;

import java.util.Scanner;

public class Main_EJ3_16_04_2024 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nroCliente = 0, montoFinal = 0;

        System.out.print("Ingrese su nro. de Cliente: ");
        nroCliente = sc.nextInt();

        if (nroCliente == 1 || nroCliente == 5 || nroCliente == 6 || nroCliente == 7) {
            montoFinal = 1500;

        } else if (nroCliente == 2 || nroCliente == 3 || nroCliente == 4) {
            montoFinal = 2200;
        }

        if (nroCliente == 1 || nroCliente == 5 || nroCliente == 6 || nroCliente == 7) {
            montoFinal = 1500;

        } else if (nroCliente == 2 || nroCliente == 3 || nroCliente == 4) {
            montoFinal = 2200;

        }
        if ((nroCliente >= 1) && (nroCliente <= 7)){
            System.out.println("El monto final de la factura es: " + montoFinal + " al mes");
        } else {
            System.out.println("No existe su nro de cliente");
        }

    }


}
