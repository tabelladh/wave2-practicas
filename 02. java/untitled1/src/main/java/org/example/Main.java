package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();

        Vehiculo vehiculo1 = new Vehiculo("Ford", "Fiesta", 1000.0);
        Vehiculo vehiculo2 = new Vehiculo("Ford", "Focus", 1200.0);
        Vehiculo vehiculo3 = new Vehiculo("Ford", "Explorer", 2500.0);
        Vehiculo vehiculo4 = new Vehiculo("Fiat", "Uno", 500.0);
        Vehiculo vehiculo5 = new Vehiculo("Fiat", "Cronos", 1000.0);
        Vehiculo vehiculo6 = new Vehiculo("Fiat", "Torino", 1250.0);
        Vehiculo vehiculo7 = new Vehiculo("Chevrolet", "Aveo", 1250.0);
        Vehiculo vehiculo8 = new Vehiculo("Chevrolet", "Spin", 2500.0);
        Vehiculo vehiculo9 = new Vehiculo("Toyota", "Corolla", 1200.0);
        Vehiculo vehiculo10 = new Vehiculo("Toyota", "Fortuner", 3000.0);
        Vehiculo vehiculo11 = new Vehiculo("Renault", "Logan", 950.0);

        List<Vehiculo> vehiculos = new java.util.ArrayList<>(List.of(vehiculo1, vehiculo2, vehiculo3, vehiculo4, vehiculo5, vehiculo6, vehiculo7, vehiculo8, vehiculo9, vehiculo10, vehiculo11));

        garage.setId(1);
        garage.setVehiculos(vehiculos);

        System.out.println(garage);

        //ordenar precio de menor a mayor
        System.out.println("con comparator");
        vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getCosto))
                .forEach(System.out::println);

        System.out.println("con lambda");
        vehiculos.stream()
                .sorted( (x, y) -> x.getCosto().compareTo(y.getCosto()) )
                .forEach(System.out::println);

        //lista ordenada por marca y precio
        System.out.println("Lista ordn por marca y precio");
        vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca).thenComparing(Vehiculo::getCosto))
                .forEach(System.out::println);

        //Lista de vehiculos con precio no mayor a 1000
        var lstVehiculos = vehiculos.stream()
                                .filter( x -> x.getCosto() < 1000)
                                .toList();

        System.out.println(lstVehiculos);

        System.out.println("Lista de vehiculos con marca Ford y precio mayor a 1000");
        List<Vehiculo> lstVehiculos2 = vehiculos.stream()
                .filter( x-> x.getMarca().equals("Ford"))
                .filter( x -> x.getCosto() >= 1000)
                .toList();


        System.out.println(lstVehiculos2);

        var promedio = vehiculos.stream()
                .mapToDouble(Vehiculo::getCosto)
                .average().getAsDouble();

        System.out.println("Promedio: " + promedio);

        System.out.printf("Promedio: %.2f", promedio); //formato con dos decimales();

        System.out.println("\n Lista de vehiculos con marca DOGE ( no existe en nuestra lista ) ");
        try {
            var lstVehiculos3 = vehiculos.stream()
                    .filter(x -> x.getMarca().equals("Doge"))
                    .findFirst()
                    .orElseThrow( () -> new RuntimeException("No se encontro el vehiculo con marca DOGE") );
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }







    }
}