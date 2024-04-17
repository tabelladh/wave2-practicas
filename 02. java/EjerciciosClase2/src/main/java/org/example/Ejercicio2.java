package org.example;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dni = 0;
        double monto = 0;


        System.out.print("Ingrese el DNI del empleado: ");
        dni = sc.nextInt();

        System.out.print("Ingrese el sueldo del empleado: ");
        monto = sc.nextDouble();
        sc.close();

        if (monto <= 20000) {
            System.out.println("El porcentaje de aumento es 20%. El total es: " + monto * 1.2);
        }
        if (monto > 20000 && monto <= 45000) {
            System.out.println("El porcentaje de aumento es 10%. El total es: " + monto * 1.1);
        }
        if (monto > 45000) {
            System.out.println("El porcentaje de aumento es 5%. El total es: " + monto * 1.05);
        }

    }
}

