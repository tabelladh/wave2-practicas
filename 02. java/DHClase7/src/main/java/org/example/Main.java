package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehiculo[] vehiculos = new Vehiculo[10];

//        for (int i = 0; i < 10; i++) {
//            System.out.println("Ingrese los datos del vehículo " + (i + 1) + ":");
//
//            System.out.print("Marca: ");
//            String marca = scanner.nextLine();
//
//            System.out.print("Modelo: ");
//            String modelo = scanner.nextLine();
//
//            System.out.print("Color: ");
//            String color = scanner.nextLine();
//
//            System.out.print("Año de fabricación: ");
//            int anioFabricacion = scanner.nextInt();
//            scanner.nextLine(); // Limpiar el buffer
//
//            System.out.print("Precio: ");
//            double precio = scanner.nextDouble();
//            scanner.nextLine(); // Limpiar el buffer
//
//            System.out.print("¿Es una moto o un auto? (moto/auto): ");
//            String tipo = scanner.nextLine();
//
//            if (tipo.equalsIgnoreCase("moto")) {
//                System.out.print("Cilindrada: ");
//                int cilindrada = scanner.nextInt();
//                scanner.nextLine(); // Limpiar el buffer
//
//                vehiculos[i] = new Moto(i + 1, marca, modelo, color, anioFabricacion, precio, cilindrada);
//            } else if (tipo.equalsIgnoreCase("auto")) {
//                System.out.print("Cantidad de puertas: ");
//                int cantidadPuertas = scanner.nextInt();
//                scanner.nextLine(); // Limpiar el buffer
//
//                System.out.print("Cantidad de asientos: ");
//                int cantidadAsientos = scanner.nextInt();
//                scanner.nextLine(); // Limpiar el buffer
//
//                System.out.print("Potencia del motor: ");
//                int potenciaMotor = scanner.nextInt();
//                scanner.nextLine(); // Limpiar el buffer
//
//                vehiculos[i] = new Auto(i + 1, marca, modelo, color, anioFabricacion, precio, cantidadPuertas, cantidadAsientos, potenciaMotor);
//            } else {
//                System.out.println("Tipo de vehículo no válido. Ingrese 'moto' o 'auto'.");
//                i--;
//            }
//        }

        // Crear 5 motos ficticias
        vehiculos[0] = new Moto(1, "Yamaha", "YZF-R6", "Rojo", 2020, 8000.0, 600);
        vehiculos[1] = new Moto(2, "Honda", "CBR600RR", "Azul", 2019, 7500.0, 600);
        vehiculos[2] = new Moto(3, "Kawasaki", "Ninja ZX-6R", "Verde", 2018, 8500.0, 636);
        vehiculos[3] = new Moto(4, "Suzuki", "GSX-R600", "Blanco", 2017, 8200.0, 600);
        vehiculos[4] = new Moto(5, "Ducati", "Panigale V2", "Negro", 2016, 12000.0, 955);

        // Crear 5 autos ficticios
        vehiculos[5] = new Auto(6, "Ford", "Focus", "Gris", 2015, 10000.0, 4, 5, 120);
        vehiculos[6] = new Auto(7, "BMW", "Serie 3", "Negro", 2014, 12500.0, 4, 5, 130);
        vehiculos[7] = new Auto(8, "Mercedes-Benz", "Clase C", "Blanco", 2013, 11000.0, 4, 5, 125);
        vehiculos[8] = new Auto(9, "Toyota", "Corolla", "Rojo", 2012, 11500.0, 4, 5, 135);
        vehiculos[9] = new Auto(10, "Chevrolet", "Cruze", "Azul", 2011, 10500.0, 4, 5, 140);



        Vehiculo[] top3MasCaros = encontrarTop3MasCaros(vehiculos);

        System.out.println("Top 3 vehículos más caros:");

        for (Vehiculo vehiculo : top3MasCaros) {
            System.out.println("\nID del vehículo: " + vehiculo.getIdVehiculo()
                    + "\nMarca del vehículo: "+vehiculo.getMarca()
                    + "\nModelo del vehículo: " + vehiculo.getModelo()
                    + "\nColor del vehículo: " + vehiculo.getColor()
                    + "\nAño de fabricación: " + vehiculo.getAnioFabricacion()
                    + "\nPrecio: " + vehiculo.getPrecio());
            vehiculo.hacerService();
        }
    }

    public static Vehiculo[] encontrarTop3MasCaros(Vehiculo[] vehiculos) {
        // Implementación del algoritmo de burbuja caserito para probar sin sort por defecto
        for (int i = 0; i < vehiculos.length - 1; i++) {
            for (int j = 0; j < vehiculos.length - i - 1; j++) {
                if (vehiculos[j].getPrecio() < vehiculos[j + 1].getPrecio()) {
                    Vehiculo temp = vehiculos[j];
                    vehiculos[j] = vehiculos[j + 1];
                    vehiculos[j + 1] = temp;
                }
            }
        }

        Vehiculo[] top3MasCaros = new Vehiculo[3];

        for (int i = 0; i < 3; i++) {
            top3MasCaros[i] = vehiculos[i];
        }

        return top3MasCaros;
    }
}
