package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la marca del vehiculo: " + (i +1));
            String marca = scanner.nextLine();
            System.out.println("Ingrese el modelo del vehiculo: " + (i +1));
            String modelo = scanner.nextLine();
            System.out.println("Ingrese el color del vehiculo: " + (i +1));
            String color = scanner.nextLine();
            System.out.println("Ingrese el año del vehiculo: " + (i +1));
            int anio = scanner.nextInt();
            scanner.nextLine();//esta linea limpia la lentura de consola
            System.out.println("Ingrese la marca del vehiculo: " + (i +1));
            double precio = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("El vehiculo a ingresar es una moto o un auto?");
            String respuesta = scanner.nextLine();
            if(respuesta.equalsIgnoreCase("auto")){
                System.out.println("Ingrese la cantidad de puertas: ");
                int puertas = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingrese la cantidad de asientos: ");
                int asientos = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingrese la potencia del motor: ");
                int potencia = scanner.nextInt();
                scanner.nextLine();
                Auto auto = new Auto(i, marca, modelo, color, anio, precio, puertas, asientos, potencia);
            } else if (respuesta.equalsIgnoreCase("moto")) {
                System.out.println("Ingrese la cilindrada: ");
                String cilindrada = scanner.nextLine();
                scanner.nextLine();
                Moto moto = new Moto(i, marca, modelo, color, anio, precio, cilindrada);
            }
        }

        scanner.close();
        }
    }
