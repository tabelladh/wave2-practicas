package org.example;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(1);

        garage.getVehiculos().add(new Vehiculo("Fiesta", "Ford", 1000));
        garage.getVehiculos().add(new Vehiculo("Focus", "Ford", 1200));
        garage.getVehiculos().add(new Vehiculo("Explorer", "Ford", 2500));
        garage.getVehiculos().add(new Vehiculo("Uno", "Fiat", 500));
        garage.getVehiculos().add(new Vehiculo("Cronos", "Fiat", 1000));
        garage.getVehiculos().add(new Vehiculo("Torino", "Fiat", 1250));
        garage.getVehiculos().add(new Vehiculo("Aveo", "Chevrolet", 1250));
        garage.getVehiculos().add(new Vehiculo("Spin", "Chevrolet", 2500));
        garage.getVehiculos().add(new Vehiculo("Corolla", "Toyota", 1200));
        garage.getVehiculos().add(new Vehiculo("Fortuner", "Toyota", 3000));
        garage.getVehiculos().add(new Vehiculo("Logan", "Renault", 950));

        // Ejercicio 3
        List<Vehiculo> vehiculosOrdenadosPorPrecio = garage.getVehiculos()
                .stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getCosto))
                .collect(Collectors.toList());
        System.out.println("Vehículos ordenados por precio:");
        vehiculosOrdenadosPorPrecio.forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo() + " - Precio: " + v.getCosto()));

        // Ejercicio 4
        List<Vehiculo> vehiculosOrdenadosPorMarcaYPrecio = garage.getVehiculos()
                .stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca).thenComparingDouble(Vehiculo::getCosto))
                .collect(Collectors.toList());
        System.out.println("\nVehículos ordenados por marca y precio:");
        vehiculosOrdenadosPorMarcaYPrecio.forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo() + " - Precio: " + v.getCosto()));

        // Ejercicio 5
        List<Vehiculo> vehiculosPrecioMenor1000 = garage.getVehiculos()
                .stream()
                .filter(v -> v.getCosto() <= 1000)
                .collect(Collectors.toList());

        List<Vehiculo> vehiculosPrecioMayor1000 = garage.getVehiculos()
                .stream()
                .filter(v -> v.getCosto() > 1000)
                .collect(Collectors.toList());

        double promedioPrecios = garage.getVehiculos()
                .stream()
                .mapToDouble(Vehiculo::getCosto)
                .average()
                .orElse(0);
        System.out.println("\nVehículos con precio menor o igual a 1000:");
        vehiculosPrecioMenor1000.forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo() + " - Precio: " + v.getCosto()));
        System.out.println("\nVehículos con precio mayor a 1000:");
        vehiculosPrecioMayor1000.forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo() + " - Precio: " + v.getCosto()));
        System.out.println("\nPromedio total de precios: " + String.format("%.2f", promedioPrecios));
    }
}