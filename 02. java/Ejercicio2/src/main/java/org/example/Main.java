package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrese documento de empleado: ");
        Scanner scanner = new Scanner(System.in);
        int documento = scanner.nextInt();
        System.out.println("Ingrese su salario en bruto: ");
        double salarioBruto = scanner.nextDouble();
        scanner.close();
        int aumento;

        if (salarioBruto <= 20000) {
            aumento = 20;
            salarioBruto = salarioBruto * 1.2;
        } else if (salarioBruto > 20000 && salarioBruto <= 45000) {
            aumento = 10;
            salarioBruto = salarioBruto * 1.1;
        } else {
            aumento = 5;
            salarioBruto = salarioBruto * 1.05;
        }
        System.out.println("Su aumento fue del " + aumento + "% y su salario ahora es: " + salarioBruto);
    }
}