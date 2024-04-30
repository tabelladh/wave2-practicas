package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        EJERCICIO 1 (ESTRUCTURA REPETITIVA)

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese el precio de costo del producto:");
//        double precioCosto = scanner.nextDouble();
//        System.out.println("Ingrese el número de fábrica (1, 2 o 3):");
//        int numeroDeFabrica = scanner.nextInt();
//        scanner.close();
//
//        double porcentajeEnvio = 0;
//
//        switch (numeroDeFabrica) {
//            case 1:
//                porcentajeEnvio = 0.07;
//            case 2:
//                porcentajeEnvio = 0.15;
//                break;
//            case 3:
//                porcentajeEnvio = 0.22;

//            default:
//                System.out.println("Número de fábrica inexistente.");
//                return;
//        }
//
//
//        double precioConEnvio = precioCosto + (precioCosto * porcentajeEnvio);
//        double precioVenta = precioConEnvio +(precioConEnvio * 0.25);
//
//        System.out.println("El precio estimado de venta es: " + String.format("$%.2f", precioVenta));



//        EJERCICIO 2 (ESTRUCTURA REPETITIVA)

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ingrese el sueldo del empleado:");
//        double sueldo = scanner.nextDouble();
//        System.out.println("Ingrese el DNI del empleado:");
//        int dni = scanner.nextInt();
//
//        scanner.close();
//        double porcentajeAumento;
//        if (sueldo <= 20000) {
//            porcentajeAumento = 0.20;
//        } else if (sueldo <= 45000) {
//            porcentajeAumento = 0.10;
//        } else {
//            porcentajeAumento = 0.05;
//        }
//
//        double aumento = sueldo * porcentajeAumento;
//        double sueldoFinal = aumento + sueldo;
//
//
//        System.out.println("Empleado con DNI " + dni);
//        System.out.println("Porcentaje de aumento: " + (porcentajeAumento * 100) + "%");
//        System.out.println("El aumento que le corresponde es de $ " + aumento);
//        System.out.println("El sueldo final con el aumento actualizado será de $ " + sueldoFinal);
//

        // EJERCICIO 3 (ESTRUCTURA REPETITIVA)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese el numero de cliente:");
//        int cliente = scanner.nextInt();
//
//            if(cliente == 2| cliente == 3| cliente == 4){
//                System.out.println("el importe a abonar es $2200");
//            }else {
//                System.out.println("el importe a abonar es $1500");
//            }

        // EJERCICIO 4 (ESTRUCTURA REPETITIVA)

        int diarioA = 0;
        int diarioB = 0;
        int diarioC = 0;
        int diarioAB = 0;
        int diarioAC = 0;
        int diarioBC = 0;
        int diarioABC = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Para cada pregunta responde con 's' si la repuesta es si, 'n' si la repuesta es no");

            for (int i = 0; i < 5; i++) {
                System.out.println("Persona " + (i + 1));
                System.out.print("Está suscripto al diario A (s/n)");
                String repuestaA = scanner.next();
                if (repuestaA.equals("s")) diarioA++;
                System.out.print("Está suscripto al diario B (s/n)");
                String repuestaB = scanner.next();
                if (repuestaB.equals("s")) diarioB++;
                System.out.print("Está suscripto al diario C (s/n)");
                String repuestaC = scanner.next();
                if (repuestaC.equals("s")) diarioC++;

                if (diarioA == 1 && diarioB == 1) diarioAB++;
                if (diarioA == 1 && diarioC == 1) diarioAC++;
                if (diarioB == 1 && diarioC == 1) diarioBC++;
                if (diarioA == 1 && diarioB == 1 && diarioC == 1) diarioABC++;
            }
            System.out.println("Suscriptos al Diario A: " + diarioA);
            System.out.println("Suscriptos al Diario B: " + diarioB);
            System.out.println("Suscriptos al Diario C: " + diarioC);
            System.out.println("Suscriptos al Diario A y B: " + diarioAB);
            System.out.println("Suscriptos al Diario A y C: " + diarioAC);
            System.out.println("Suscriptos al Diario B y C: " + diarioBC);
            System.out.println("Suscriptos a todos los diarios: " + diarioABC);


    }
}