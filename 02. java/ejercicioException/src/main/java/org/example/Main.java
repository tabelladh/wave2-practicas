package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int loteria = (int) (Math.random()*500);
        int tuNumero = 0;
        int intentos = 0;
        System.out.println("ingresa un numero entre o y 500");
        do{

            try {
                tuNumero = sc.nextInt();

                if (tuNumero > 500){
                    throw new OutOfRangeException("el numeroelejido debe ser menor a 500");
                }

                if (tuNumero < loteria){
                    System.out.println("elegi un numero mayor a " + tuNumero);
                    intentos++;
                }
                if (tuNumero > loteria){
                    System.out.println("elegi un numero menor a " + tuNumero);
                    intentos++;
                }
                if (tuNumero == loteria){
                    System.out.println("ganaste, te llevo acertar " + intentos + " intentos");
                    intentos++;
                }

            }catch (InputMismatchException e){
                System.err.println("debes ingresar un numero");
                intentos++;
                sc.next();
            } catch (OutOfRangeException e) {
                System.err.println(e.getMessage());
                intentos++;
                sc.next();
            }

        }while (tuNumero != loteria);

        sc.close();

    }
}