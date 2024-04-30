package org.example;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese numero de dni del empleado: ");
        String dni = scanner.nextLine();


        System.out.print("Ingrese el sueldo : ");
        double sueldo = scanner.nextDouble();

        double porcentaje;

        if (sueldo <= 20000) {
            porcentaje= 0.20;
        } else if (sueldo <= 45000) {
            porcentaje = 0.10;
        } else {
            porcentaje = 0.05;
        }

        double sueldoFinal = sueldo + (sueldo * porcentaje);


        System.out.println ("El porcentaje de aumento es del :" + (porcentaje * 100) + "%.");
        System.out.println ("El sueldo Final es de :$" + (sueldoFinal));
    }


}

