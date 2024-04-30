package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        // Crear un array de 10 posiciones
        Vehiculo[] vehiculos = new Vehiculo[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("\nIngrese los datos del vehículo " + (i + 1) + ":");
            System.out.print("Marca: ");
            String marca = scanner.next();
            System.out.print("Modelo: ");
            String modelo = scanner.next();
            System.out.print("Color: ");
            String color = scanner.next();
            System.out.print("Año de fabricación: ");
            int anioFabricacion = scanner.nextInt();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();

            System.out.print("¿Es una moto o un auto? (moto/auto): ");
            String tipoVehiculo = scanner.next();

            if (tipoVehiculo.equals("moto")) {
                System.out.print("Cilindrada: ");
                int cilindrada = scanner.nextInt();
                vehiculos[i] = new Moto(i + 1, marca, modelo, color, anioFabricacion, precio, cilindrada);
            } else if (tipoVehiculo.equals("auto")) {
                System.out.print("Cantidad de puertas: ");
                int cantidadPuertas = scanner.nextInt();
                System.out.print("Cantidad de asientos: ");
                int cantidadAsientos = scanner.nextInt();
                System.out.print("Potencia del motor: ");
                int potenciaMotor = scanner.nextInt();
                vehiculos[i] = new Auto(i + 1, marca, modelo, color, anioFabricacion, precio, cantidadPuertas, cantidadAsientos, potenciaMotor);
            } else {
                System.out.println("Tipo de vehículo no válido. Se asignará un vehículo genérico.");
                vehiculos[i] = new Vehiculo(i + 1, marca, modelo, color, anioFabricacion, precio);
            }
        }
        Arrays.sort(vehiculos, Comparator.comparingDouble(Vehiculo::getPrecio).reversed());
        System.out.println("\nTop 3 de vehículos más caros:");
        for (int i = 0; i < Math.min(3, vehiculos.length); i++) {
            Vehiculo vehiculo = vehiculos[i];
            System.out.println((i + 1) + ". " + vehiculo.getClass().getSimpleName() +
                    " Marca: " + vehiculo.marca + " Modelo: " + vehiculo.modelo );

        }

    }
}