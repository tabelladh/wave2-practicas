package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suscripcionesA = 0;
        int suscripcionesB = 0;
        int suscripcionesC = 0;
        int suscripcionesAB = 0;
        int suscripcionesAC = 0;
        int suscripcionesBC = 0;
        int suscripcionesABC = 0;
        int suscripcionesSoloA = 0;

        System.out.println("Ingrese los datos de las suscripciones (A/B/C) de las 50 personas:");
        for (int i = 0; i < 3; i++) {
            String suscripciones = scanner.nextLine();
            if (suscripciones.contains("A")) {
                suscripcionesA++;
                if (suscripciones.contains("B")) {
                    suscripcionesAB++;
                    if (suscripciones.contains("C")) {
                        suscripcionesABC++;
                    }
                } else if (suscripciones.contains("C")) {
                    suscripcionesAC++;
                } else {
                    suscripcionesSoloA++;
                }
            } else if (suscripciones.contains("B")) {
                suscripcionesB++;
                if (suscripciones.contains("C")) {
                    suscripcionesBC++;
                }
            } else if (suscripciones.contains("C")) {
                suscripcionesC++;
            }
        }

        System.out.println("Suscriptos a los 3 diarios: " + suscripcionesABC);
        System.out.println("Suscriptos a A y C: " + suscripcionesAC);
        System.out.println("Suscriptos a A y B: " + suscripcionesAB);
        System.out.println("Suscriptos a B y C: " + suscripcionesBC);
        System.out.println("Suscriptos solo a A: " + suscripcionesSoloA);

        scanner.close();
    }
}