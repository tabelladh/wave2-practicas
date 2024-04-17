package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Ingrese el DNI de la persona:");
        int documento = scanner2.nextInt();

        System.out.println("Ingrese el sueldo de la persona:");
        double monto = scanner2.nextDouble();

        if (monto < 20000) {
            System.out.println("El aumento debe ser del 20% : "  + (monto + monto * 0.20));
        } else if (monto <= 45000) {
            System.out.println("El aumento debe ser del 10%: " + (monto + monto * 0.10));
        } else {
            System.out.println("El aumento debe ser del 5%: " + (monto + monto * 0.05));
        }

        scanner2.close();

        }
    }