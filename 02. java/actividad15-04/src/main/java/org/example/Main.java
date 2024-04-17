package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//actividad 1
        String apellido = "Gomez";
        int edad = 35;
        boolean esCasado = false;
        double sueldo = 45857.90;
        String nombre = "Julián";

        //System.out.println(apellido + " " + nombre+ " " + edad+ " " + sueldo+ " " + esCasado);
//actividad 2
        int edades;
        double sueldos;
        String apellidos;
        String direccion;
        boolean licenciaDeConducir;
        double estaturaDeLaPersona;
        int cantidadDeHijos;
//actividad 3
//        System.out.println("ingrese el la cantidad de dias");
//        int dias = scanner.nextInt();
//        System.out.println("el monto a pagar es: $" + dias*2);
//actividad 4
        System.out.println("ingresa el monto del premio:");
        double premio = scanner.nextDouble();

        double imp1 = 2.45;
        double imp2 = 15;
        double imp3 = 3;
        double totalDescuento = ((imp1 + imp2 + imp3) * premio)/100;
        System.out.println("el premio a cobrar es:$" + (premio - totalDescuento));




    }
}