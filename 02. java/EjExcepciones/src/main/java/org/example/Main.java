package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int numeroAleatorio = (int) (Math.random()*500) + 1;
//        int intetos = 0;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Bienvenido al juego 'Adivina el Numero'");
//
//        while (true) {
//            try {
//                System.out.println("Ingrese un numero del 1 al 500");
//                int numeroIngresado = scanner.nextInt();
//                intetos++;
//
//                if (numeroIngresado < 1 || numeroIngresado > 500) {
//                    throw new NumeroFueraDeRangoException("El número ingresado está fuera del rango permitido.");
//                }
//
//                if (numeroIngresado == numeroAleatorio) {
//                    System.out.println("Felicidades, adivinaste el numero " + numeroIngresado + " en el intento numero " + intetos);
//                    break;
//                } else if (numeroIngresado < numeroAleatorio) {
//                    System.out.println("El numero ingresado es menor");
//                } else {
//                    System.out.println("El numero ingresado es mayor");
//                }
//            }catch (InputMismatchException e){
//                System.out.println("ERROR: ingrese un valor valido");
//                scanner.nextLine();
//            }catch (NumeroFueraDeRangoException e){
//                System.out.println("ERROR: " + e.getMessage());
//            }
//        }

        int numeroEntero[][] = new int[4][3];

        Scanner scanner = new Scanner(System.in);
         for (int i = 0; i < numeroEntero.length; i++) {
            for (int j = 0; j < numeroEntero[i].length; j++) {
                System.out.println("Ingrese un numero para la fila " + i + " y la columna " + j);
                numeroEntero[i][j] = scanner.nextInt();
            }
        }
         System.out.println("Que tipo de operacion desea realizar: " +
                 "(Sumar= 0), (Restar= 1), (Multiplicar= 2), (Dividir= 3)");
         int respuesta = scanner.nextInt();

         switch (respuesta) {
             case 0:
                 int suma = numeroEntero[0][0] + numeroEntero[0][1] + numeroEntero[0][2];
                 System.out.println("La suma es: " + suma);
                 break;
             case 1:
                 int resta = numeroEntero[1][0] + numeroEntero[1][1] + numeroEntero[1][2];
                 System.out.println("La resta es: " + resta);
                 break;
             case 2:
                 int multiplicacion = numeroEntero[2][0] * numeroEntero[2][1] * numeroEntero[2][2];
                 System.out.println("La multiplicacion es: " + multiplicacion);
                 break;
             case 3:
                 int division = numeroEntero[3][0] / numeroEntero[3][1] / numeroEntero[3][2];
                 System.out.println("La division es: " + division);
                 break;
             default:
                 System.out.println("La opcion ingresada no es valida");

         }

    }
}
