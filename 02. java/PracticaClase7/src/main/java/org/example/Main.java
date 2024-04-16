package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Ejercicio 1
        System.out.println("Ingrese el precio del producto");
        Scanner teclado = new Scanner(System.in);
        double precio = teclado.nextDouble();
        System.out.println("Ingrese número de fábrica");
        Scanner scanner = new Scanner(System.in);
        int numeroFabrica = scanner.nextInt();
        double precioMasEnvio = 0;
        double precioFinal;

        if(numeroFabrica == 1){
            precioMasEnvio = precio + (precio * 0.07);
        } else if (numeroFabrica == 2) {
            precioMasEnvio = precio + (precio * 0.15);
        } else if (numeroFabrica == 3) {
            precioMasEnvio = precio + (precio * 0.22);
        }

        precioFinal = precioMasEnvio + (precioMasEnvio*0.25);
        System.out.println("El precio final es " + precioFinal);

        Ejercicio 2

        System.out.println("Ingrese su sueldo");
        Scanner teclado = new Scanner(System.in);
        double sueldo = teclado.nextInt();
        double sueldoAumento;
        if(sueldo <= 20000){
            System.out.println("Te corresponde un 20% de aumento");
            sueldoAumento = sueldo + (sueldo * 0.2);
            System.out.println("Por lo que tu sueldo será de " + sueldoAumento);
        } else if (sueldo > 20000 && sueldo <= 45000 ) {
            System.out.println("Te corresponde un 10% de aumento");
            sueldoAumento = sueldo + (sueldo * 0.1);
            System.out.println("Por lo que tu sueldo será de " + sueldoAumento);
        } else if (sueldo > 45000) {
            System.out.println("Te corresponde un 5% de aumento");
            sueldoAumento = sueldo + (sueldo * 0.05);
            System.out.println("Por lo que tu sueldo será de " + sueldoAumento);
        }

         Ejercicio 3
        int servicio1 = 1500;
        int servicio2 = 2200;
        System.out.println("Ingrese número de cliente");
        Scanner teclado = new Scanner(System.in);
        int cliente = teclado.nextInt();
            if(cliente == 1 || cliente == 5 || cliente == 6 || cliente == 7){
                System.out.println("El monto es  de " + servicio1);
            } else {
                System.out.println("El monto es de " + servicio2);
            }

         */
        for(int i = 0; i<50; i++){
            System.out.println("Ingrese a que diario está suscripto");
            Scanner teclado = new Scanner(System.in);
            String diario = teclado.next();
        }


    }
}