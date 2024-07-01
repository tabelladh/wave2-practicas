package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroUsuario  = scanner.nextInt();
        int numeroAAdivinar = (int) (Math.random() * 500);

        do {
                try {
                    System.out.println("Ingrese un numero entre el 1 y el 500");

                }
                catch ()
            } while (numeroUsuario != numeroAAdivinar);
    }
}

