package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int contadorA = 0;
        int contadorB = 0;
        int contadorC = 0;
        Scanner scanner =  new Scanner(System.in);

        int diarioA;
        int diarioB;
        int diarioC;
        System.out.println("*****Bienvenido*****");
        for (int i = 0; i <10 ; i++) {
            System.out.println("Ingrese el numero 1 si esta subscripto al Diario A");
            diarioA = scanner.nextInt();
            if(diarioA == 1) {
                contadorA++;
            }
            System.out.println("Ingrese el numero 2 si esta subscripto al Diario B");
            diarioB = scanner.nextInt();
            if(diarioB == 2) {
                contadorB++;
            }
            System.out.println("Ingrese el numero 3 si esta subscripto al Diario C");
            diarioC = scanner.nextInt();
            if(diarioC == 3) {
                contadorC++;
            }
        }
        System.out.println("Hay " + (contadorA + contadorB + contadorC) + " personas subscriptas a los 3 Diarios");
        System.out.println("Hay " + (contadorA + contadorC) + " subscriptas al A y C");
        System.out.println("Hay " + (contadorA + contadorB) + " subscriptas al A y B");
        System.out.println("Hay " + (contadorB + contadorC) + " subscriptas al B y C");
        System.out.println("Hay " + contadorA + " subscriptas al Diario A");
    }
}