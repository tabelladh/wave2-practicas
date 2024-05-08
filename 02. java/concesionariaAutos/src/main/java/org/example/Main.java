package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehiculo[] vehiculos = new Vehiculo[10];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los datos de la moto " + (i + 1) + ":");
            vehiculos[i] = ingresarVehiculo(scanner, true);
        }


        for (int i = 5; i < 10; i++) {
            System.out.println("Ingrese los datos del auto " + (i - 4) + ":");
            vehiculos[i] = ingresarVehiculo(scanner, false);
        }


        ordenarPorPrecioDescendente(vehiculos);
        System.out.println("\nTop 3 de vehículos más caros:");
        for (int i = 0; i < 3; i++) {
            System.out.println(vehiculos[i]);
        }

        // Realizar service a los 3 vehículos más caros
        System.out.println("Realizando service a los 3 vehículos más caros:");
        for (int i = 0; i < 3; i++) {
            vehiculos[i].hacerService();
        }
    }

    public static Vehiculo ingresarVehiculo(Scanner scanner, boolean esMoto) {
        System.out.print("Id: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Año de fabricación: ");
        int anioFabricacion = scanner.nextInt();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        if (esMoto) {
            System.out.print("Cilindrada: ");
            int cilindrada = scanner.nextInt();
            return new Moto(id, marca, modelo, color, anioFabricacion, precio, cilindrada);
        } else {
            System.out.print("Cantidad de puertas: ");
            int cantidadPuertas = scanner.nextInt();
            System.out.print("Cantidad de asientos: ");
            int cantidadAsientos = scanner.nextInt();
            System.out.print("Potencia del motor: ");
            int potenciaMotor = scanner.nextInt();
            return new Auto(id, marca, modelo, color, anioFabricacion, precio, cantidadPuertas, cantidadAsientos, potenciaMotor);
        }
    }

    private static void ordenarPorPrecioDescendente(Vehiculo[] vehiculos) {
        for (int i = 0; i < vehiculos.length - 1; i++) {
            for (int j = 0; j < vehiculos.length - i - 1; j++) {
                if (vehiculos[j].getPrecio() < vehiculos[j + 1].getPrecio()) {
                    Vehiculo temp = vehiculos[j];
                    vehiculos[j] = vehiculos[j + 1];
                    vehiculos[j + 1] = temp;
                }
            }
        }
    }
}