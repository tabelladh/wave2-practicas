package org.example;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {

//        VehiculoGral[] vehiculos = new VehiculoGral[10];
//        Scanner teclado = new Scanner(System.in);
//
//        for (int i = 0; i < 5; i++){
//            System.out.println("Ingrese el id del auto");
//            int idVehiculo = teclado.nextInt();
//            System.out.println("Ingrese la marca del auto");
//            String marca = teclado.next();
//            System.out.println("Ingrese el modelo del auto");
//            int modelo = teclado.nextInt();
//            System.out.println("Ingrese el color del auto");
//            String color = teclado.next();
//            System.out.println("Ingrese el anio de fabricacion del auto");
//            int anioFabricacion = teclado.nextInt();
//            System.out.println("Ingrese el precio del auto");
//            int precio = teclado.nextInt();
//            System.out.println("Ingrese la cantidad de puertas del auto");
//            int cantidadPuertas = teclado.nextInt();
//            System.out.println("Ingrese la cantidad de asientos del auto");
//            int cantidadAsientos = teclado.nextInt();
//            System.out.println("Ingrese la potencia del motor del auto");
//            int potenciaMotor = teclado.nextInt();
//            vehiculos[i] = new Auto(idVehiculo, marca, modelo, color, anioFabricacion, precio, cantidadPuertas, cantidadAsientos, potenciaMotor);
//        }
//
//        for (int i = 5; i < 10; i++){
//            System.out.println("Ingrese el id de la moto");
//            int idVehiculo = teclado.nextInt();
//            System.out.println("Ingrese la marca de la moto");
//            String marca = teclado.next();
//            System.out.println("Ingrese el modelo de la moto");
//            int modelo = teclado.nextInt();
//            System.out.println("Ingrese el color de la moto");
//            String color = teclado.next();
//            System.out.println("Ingrese el anio de fabricacion de la moto");
//            int anioFabricacion = teclado.nextInt();
//            System.out.println("Ingrese el precio de la moto");
//            int precio = teclado.nextInt();
//            System.out.println("Ingrese la cilindrada de la moto");
//            int cilindrada = teclado.nextInt();
//            vehiculos[i] = new Moto(idVehiculo, marca, modelo, color, anioFabricacion, precio, cilindrada);
//        }

//        // obtener los 3 vehiculos mas caros

        List <VehiculoGral> listaVehiculosCaros = new ArrayList<VehiculoGral>(); // declara la lista

        VehiculoGral auto1 = new Auto(1, "Ford", 2009, "Azul", 2009, 20000,5, 4, 3);
        VehiculoGral auto2 = new Auto(2, "Toyota", 2015, "Negro", 2015, 25000,5, 4, 5);
        VehiculoGral auto3 = new Auto(3, "Chevrolet", 2018, "Rojo", 2018, 30000,5, 4, 5);
        VehiculoGral auto4 = new Auto(4, "Honda", 2012, "Blanco", 2012, 18000,5, 4, 4);
        VehiculoGral auto5 = new Auto(5, "BMW", 2020, "Gris", 2020, 40000,5, 4, 4);
        VehiculoGral moto1 = new Moto(6, "Yamaha", 2019, "Negro", 2019, 15000, 125);

        listaVehiculosCaros.add(auto1);
        listaVehiculosCaros.add(auto2);
        listaVehiculosCaros.add(auto3);
        listaVehiculosCaros.add(auto4);
        listaVehiculosCaros.add(auto5);
        listaVehiculosCaros.add(moto1);

        listaVehiculosCaros.stream().sorted(Comparator.comparing(VehiculoGral::getPrecio).reversed())
                .limit(3)
                .forEach(System.out::println);









    }
}




