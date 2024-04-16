package org.example;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        /*EJERCICIOS VARIABLES*/
        /*Ejercicio1
        String apellido = "Gomez";
        int edad = 35;
        boolean variable = false;
        double sueldo = 45857.90;
        String nombre = "Julián";

        /*Ejercicio2
        String nombre;
        int edad;
        double sueldo;
        String apellido;
        String direccion;
        boolean licenciaDeConducir;
        double estaturaDeLaPersona;
        int cantidadDeHijos;
        */

        /*Ejercicio3
        Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la cantidad de días:");
		int cantDias = sc.nextInt();
		System.out.print("El monto total es: $" + cantDias*2);
		sc.close();
        */

        /*Ejercicio4
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el monto en bruto del premio: ");
        double montoBruto = sc.nextDouble();
        double montoNeto = montoBruto * (1 - (2.45 + 15 + 3) / 100);
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        String montoNetoFormateado = formato.format(montoNeto);
        System.out.print("El monto neto que le corresponde es: $" + montoNetoFormateado);
        sc.close();
        */

        /*EJERCICIOS ESTRUCTURAS*/
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio de costo del producto: $");
        double precioPrducto = sc.nextDouble();
        System.out.print("Ingrese el número de fábrica (1-2-3): ");
        int fabrica = sc.nextInt();
        switch (fabrica) {
            case 1:
                double ganancia1 = precioPrducto * 1.07 * 1.25;
                System.out.print("El precio de venta es: $" + ganancia1);
                break;
            case 2:
                double ganancia2 = precioPrducto * 1.15 * 1.25;
                System.out.print("El precio de venta es: $" + ganancia2);
                break;
            case 3:
                double ganancia3 = precioPrducto * 1.22 * 1.25;
                System.out.print("El precio de venta es: $" + ganancia3);
                break;
            default: System.out.print("No ingresó un número de fábrica correcto");
        }
        sc.close();
        */

        /*Ejercicio2
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su sueldo: $");
        double sueldo = sc.nextDouble();
        System.out.print("Ingrese su DNI sin \"-\": ");
        int dni = sc.nextInt();
        if (sueldo <= 20000) {
            System.out.print("Le corresponde un 20% de aumento");
        } else if (sueldo > 20000 && sueldo <= 45000) {
            System.out.print("Le corresponde un 10% de aumento");
        } else {
            System.out.print("Le corresponde un 5% de aumento");
        }
        sc.close();
        */

        /*Ejercicio3
        int precioServicio1 = 1500;
        int precioServicio2 = 1500 + 700;
        int[] montos = {
                precioServicio1, // Cliente 1
                precioServicio2, // Cliente 2
                precioServicio2, // Cliente 3
                precioServicio2, // Cliente 4
                precioServicio1, // Cliente 5
                precioServicio1, // Cliente 6
                precioServicio1  // Cliente 7
        };
        System.out.println("Monto total de las facturas:");
        for (int i = 0; i < montos.length; i++) {
            System.out.println("Cliente " + (i + 1) + ": $" + montos[i]);
        }
        sc.close();
        */

        /*Ejercicio4
        Scanner sc = new Scanner(System.in);
        int contadorABC = 0;
        int contadorA = 0;
        int contadorAC = 0;
        int contadorAB = 0;
        int contadorBC = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Persona " + (i + 1) + ":");
            System.out.print("¿Está suscripto a los 3 diarios? (si/no): ");
            String tresDiarios = sc.next();
            if (tresDiarios.equalsIgnoreCase("si")) {
                contadorABC++;
            } else {
                System.out.print("¿A cuántos está suscripto? (1/2): ");
                int cantDiarios = sc.nextInt();
                if (cantDiarios == 1) {
                    contadorA++;
                } else {
                    System.out.print("Ingrese el primer diario al que está suscripto: ");
                    String diario1 = sc.next();
                    System.out.print("Ingrese el segundo diario al que está suscripto: ");
                    String diario2 = sc.next();
                    if (diario1.equals("a") && diario2.equals("c")) {
                        contadorAC++;
                    } else if (diario1.equals("a") && diario2.equals("b")) {
                        contadorAB++;
                    } else {
                        contadorBC++;
                    }
                }
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Total de suscriptos a los 3 diarios: " + contadorABC);
        System.out.println("Total de suscriptos al diario A: " + contadorA);
        System.out.println("Total de suscriptos a los diarios A y C: " + contadorAC);
        System.out.println("Total de suscriptos a los diarios A y B: " + contadorAB);
        System.out.println("Total de suscriptos a los diarios B y C: " + contadorBC);

        sc.close();
        */
    }
}