package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto(2, "Honda", "CBR", "Negro", 2021, 12000.0, 250);
        Auto auto = new Auto(3, "Ford", "Focus", "Azul", 2020, 18000.0, 4, 5, 150);

        moto.hacerService();
        auto.hacerService();

        //pido los datos para completar array
        Scanner scanner = new Scanner(System.in);
        Vehiculo[] vehiculos = new Vehiculo[10];

        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("Ingrese los datos del vehículo " + (i + 1) + ":");

            System.out.print("Id del vehículo: ");
            int idVehiculo = scanner.nextInt();
            scanner.nextLine();

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

            System.out.println("Es un auto o una moto? Escriba segun corresponda: (auto/moto): ");
            String tipoVehiculo = scanner.next();

            if (tipoVehiculo.equals("auto")) {
                System.out.print("Cantidad de puertas: ");
                int cantidadPuertas = scanner.nextInt();

                System.out.print("Cantidad de asientos: ");
                int cantidadAsientos = scanner.nextInt();

                System.out.print("Potencia del motor: ");
                double potenciaMotor = scanner.nextDouble();

                vehiculos[i] = new Auto(idVehiculo, marca, modelo, color, anioFabricacion, precio, cantidadPuertas, cantidadAsientos, potenciaMotor);
            } else if (tipoVehiculo.equals("moto")) {
                System.out.print("Cilindrada: ");
                int cilindrada = scanner.nextInt();

                vehiculos[i] = new Moto(idVehiculo, marca, modelo, color, anioFabricacion, precio, cilindrada);
            }
        }

        // otro for para calcular el mas caro.
        Arrays.sort(vehiculos, Comparator.comparingDouble(Vehiculo::getPrecio).reversed());

        System.out.println("Los 3 vehículos más caros son:");
        for (int i = 0; i < Math.min(3, vehiculos.length); i++) {
            System.out.println((i + 1) + ". " + vehiculos[i].marca + " " + vehiculos[i].modelo + " - Precio: $" + vehiculos[i].precio);
            vehiculos[i].hacerService(); // Realizar service a los vehículos más caros
        }
    }
}