package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1

        /* String apellido = Gomez;
        int edad = 35;
        boolean esCasado = false;
        double sueldo = 45857.90
        String nombre = "Julián";

        System.out.print("Ingrese la edad: ");
        Scanner scanner =  new Scanner(System.in);
        int edad = scanner.nextInt();
        System.out.println("Mi edad es: " + edad);
        scanner.close(); */

        //Ejercicio 2

        /* String nombre;
        int edad;
        double sueldo;
        String apellido;
        String direccion;
        boolean licenciaDeConducir;
        double estaturaDeLaPersona;
        int cantidaDeHijos; */

        // Ejercicio 3

//        int precioPorDia = 2;
//
//        System.out.print("Ingrese los dias: ");
//        Scanner scanner =  new Scanner(System.in);
//        int dias = scanner.nextInt();
//        System.out.println("El total es: " + (dias * precioPorDia));
//        scanner.close();

        System.out.print("Ingrese el premio: ");
        Scanner scanner =  new Scanner(System.in);
        double premio = scanner.nextDouble();
        double im1 = premio * 0.0245;
        double im2 = premio * 0.15;
        double im3 = premio * 0.03;

        System.out.println("El total es: " + (premio - (im1 + im2 + im3)));
    }

}