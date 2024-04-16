package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int precioPorDia = 2;

        System.out.print("Ingrese los dias a trabajar: ");
        Scanner scanner =  new Scanner(System.in);
        int dias = scanner.nextInt();
        System.out.println("El monto total por " +dias+" días es: " + (dias * precioPorDia));
        scanner.close();
        }
    }

