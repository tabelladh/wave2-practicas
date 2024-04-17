package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nombre = "Julián";
        String apellido = "Gomez";
        boolean esCasado =  false;
        double sueldo = 45857.90;

        System.out.println("Hola, soy: " + nombre + " " + apellido );
        System.out.println("Mi sueldo es: " + sueldo + ". : " + esCasado);

        System.out.print("Ingrese la edad: ");
        Scanner scanner =  new Scanner(System.in);
        int edad = scanner.nextInt();
        System.out.println("Edad: " + edad);
        scanner.close();


    }
}