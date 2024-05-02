/*
Ejercicio 1: Inicia creando una clase Vehículo con los atributos modelo, marca y costo,
luego crea una clase garage con los atributos id o identificador único y una lista de vehículos.
Crea además los constructores de las clases y los métodos Setter y Getter.
Ejercicio 2: Haz una clase Main con el método main para representar un escenario donde se crea una
instancia de la clase garage con una lista de vehículos según la tabla.
Haciendo uso del método sort en la lista de Vehículos con expresiones lambda, obtén una lista de
vehículos ordenados por precio de menor a mayor, imprime por pantalla el resultado.
Ejercicio 4: De la misma forma anterior imprime una lista ordenada por marca y a su vez por precio.
Ejercicio 5: Se desea extraer una lista de vehículos que con precio no mayor a 1000, luego otra con precios
mayor o igual 1000 y por último, obtén el promedio total de precios de toda la lista de vehículos.
*/

package org.example.lambdaGenericWrapperStreams.garage;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(1);
        garage.agregarVehiculo(new Vehiculo("Fiesta", "Ford", 1000));
        garage.agregarVehiculo(new Vehiculo("Focus", "Ford", 1200));
        garage.agregarVehiculo(new Vehiculo("Explorer", "Ford", 2500));
        garage.agregarVehiculo(new Vehiculo("Uno", "Fiat", 500));
        garage.agregarVehiculo(new Vehiculo("Cronos", "Fiat", 1000));
        garage.agregarVehiculo(new Vehiculo("Torino", "Fiat", 1250));
        garage.agregarVehiculo(new Vehiculo("Aveo", "Chevrolet", 1250));
        garage.agregarVehiculo(new Vehiculo("Spin", "Chevrolet", 2500));
        garage.agregarVehiculo(new Vehiculo("Corolla", "Toyota", 1200));
        garage.agregarVehiculo(new Vehiculo("Fortuner", "Toyota", 3000));
        garage.agregarVehiculo(new Vehiculo("Logan", "Renault", 950));

        // Ejercicio 3
        System.out.println("Lista de vehículos ordenados por precio de menor a mayor:");
        garage.getVehiculos().stream()
                .sorted(Comparator.comparing(Vehiculo::getCosto)) //de todos los elementos (::) de vehiculo trae el costo y lo ordena
                .forEach(vehiculo -> System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo() + " - Precio: $" + vehiculo.getCosto()));

        // Ejercicio 4
        System.out.println("\nLista de vehículos ordenados por marca y precio:");
        garage.getVehiculos().stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca).thenComparing(Vehiculo::getCosto))//se coloca el tipo en .comparing cuando queres guardarlo en un mapa
                .forEach(vehiculo -> System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo() + " - Precio: $" + vehiculo.getCosto()));

        // Ejercicio 5
        System.out.println("\nLista de vehículos con precio no mayor a 1000:");
        var listaMenorMil = garage.getVehiculos().stream()
                .filter(vehiculo -> vehiculo.getCosto() <= 1000).toList();
        listaMenorMil.forEach(vehiculo -> System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo() + " - Precio: $" + vehiculo.getCosto()));

        System.out.println("\nLista de vehículos con precio mayor o igual a 1000:");
        var listaMayorMil = garage.getVehiculos().stream()
                .filter(vehiculo -> vehiculo.getCosto() >= 1000).toList();
        listaMayorMil.forEach(vehiculo -> System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo() + " - Precio: $" + vehiculo.getCosto()));

        double promedioPrecios = garage.getVehiculos().stream()
                .mapToDouble(Vehiculo::getCosto)
                .average()
                .getAsDouble();

        // Formatear el promedio a dos decimales
        String promedioFormateado = String.format("%.2f", promedioPrecios);
        System.out.println("\nPromedio de precios de todos los vehículos: $" + promedioFormateado);

        //Excepcion
        System.out.println("Lista de vehiculos con marca Dodge:");
        try {
        garage.getVehiculos().stream()
                .filter(vehiculo -> vehiculo.getMarca().equals("Dodge"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No se encontraron vehiculos con marca Dodge"));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}