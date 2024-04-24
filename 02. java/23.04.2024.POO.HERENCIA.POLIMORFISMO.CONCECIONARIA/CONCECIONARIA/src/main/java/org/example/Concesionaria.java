package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Concesionaria {
    private Vehiculo[] vehiculos = new Vehiculo[10];

    public void ingresarVehiculos() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el tipo de vehículo (1 para Moto, 2 para Auto):");
            int tipo = scanner.nextInt();
            System.out.println("Ingrese el id del vehículo:");
            int id = scanner.nextInt();
            System.out.println("Ingrese la marca del vehículo:");
            String marca = scanner.next();
            System.out.println("Ingrese el modelo del vehículo:");
            String modelo = scanner.next();
            System.out.println("Ingrese el color del vehículo:");
            String color = scanner.next();
            System.out.println("Ingrese el año de fabricación del vehículo:");
            int anio = scanner.nextInt();
            System.out.println("Ingrese el precio del vehículo:");
            double precio = scanner.nextDouble();

            if (tipo == 1) {
                System.out.println("Ingrese la cilindrada de la moto:");
                int cilindrada = scanner.nextInt();
                vehiculos[i] = new Moto(id, marca, modelo, color, anio, precio, cilindrada);
            } else if (tipo == 2) {
                System.out.println("Ingrese la cantidad de puertas del auto:");
                int puertas = scanner.nextInt();
                System.out.println("Ingrese la cantidad de asientos del auto:");
                int asientos = scanner.nextInt();
                System.out.println("Ingrese la potencia del motor del auto:");
                double potencia = scanner.nextDouble();
                vehiculos[i] = new Auto(id, marca, modelo, color, anio, precio, puertas, asientos, potencia);
            }
        }
        scanner.close();
    }

    public void top3VehiculosMasCaros() {
        Arrays.sort(vehiculos, Comparator.comparing(Vehiculo::getPrecio).reversed());
        System.out.println("Top 3 de vehículos más caros:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + vehiculos[i].getMarca() + " " + vehiculos[i].getModelo() + ": " + vehiculos[i].getPrecio());
            vehiculos[i].hacerService();
        }
    }
}

