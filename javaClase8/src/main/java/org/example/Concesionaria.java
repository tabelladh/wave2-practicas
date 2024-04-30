package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Concesionaria {
    public static void main(String[] args) {
        Moto moto= new Moto(1,"Honda","cbr","Negra",2024,27000,600);



        //Auto

        Auto auto = new  Auto(2,"bmw","serie3","Blanco",2024,60000,3,5,3000);





        Vehiculo[] vehiculos = new Vehiculo[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar 5 motos:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Moto #" + (i + 1));

            // Pedir ID del vehículo
            System.out.print("Ingrese el ID del vehículo: ");
            int idVehiculo = scanner.nextInt();


            System.out.print("Ingrese la marca: ");
            String marca = scanner.next();

            // Pedir modelo del vehículo
            System.out.print("Ingrese el modelo: ");
            String modelo = scanner.next();


            System.out.print("Ingrese el color: ");
            String color = scanner.next();


            System.out.print("Ingrese el año de fabricación: ");
            int anioFabricacion = scanner.nextInt();


            System.out.print("Ingrese el precio: ");
            double precio = scanner.nextDouble();


            System.out.print("Ingrese la cilindrada: ");
            int cilindrada = scanner.nextInt();


            vehiculos[i] = new Moto(idVehiculo, marca, modelo, color, anioFabricacion, precio, cilindrada);
        }
        System.out.println("\nIngresar 5 automóviles:"); // Mensaje para indicar el cambio a autos


        //  ingresar  autos
        for (int i = 5; i < 10; i++) {
            System.out.println("Auto #" + (i - 4)); // Indica qué auto se está ingresando


            System.out.print("Ingrese el ID del vehículo: ");
            int idVehiculo = scanner.nextInt();


            System.out.print("Ingrese la marca: ");
            String marca = scanner.next();


            System.out.print("Ingrese el modelo: ");
            String modelo = scanner.next();


            System.out.print("Ingrese el color: ");
            String color = scanner.next();


            System.out.print("Ingrese el año de fabricación: ");
            int anioFabricacion = scanner.nextInt();


            System.out.print("Ingrese el precio: ");
            double precio = scanner.nextDouble();


            System.out.print("Ingrese la cantidad de puertas: ");
            int cantidadPuertas = scanner.nextInt();


            System.out.print("Ingrese la cantidad de asientos: ");
            int cantidadAsientos = scanner.nextInt(); // Leer la cantidad de asientos como entero


            System.out.print("Ingrese la potencia del motor: ");
            int potenciaMotor = scanner.nextInt();


            vehiculos[i] = new Auto(idVehiculo, marca, modelo, color, anioFabricacion, precio, cantidadPuertas, cantidadAsientos, potenciaMotor);
        }


        scanner.close();

        auto.hacerService();
        auto.calibrarCubiertas();
        auto.otorgarGarantia();


        moto.hacerService();
        moto.calibrarCubiertas();
        moto.otorgarGarantia();




        Arrays.sort(vehiculos, (v1, v2) -> Double.compare(v2.getPrecio(), v1.getPrecio()));

        System.out.println("\nLos 3 vehículos más caros:");
        for (int i = 0; i < 3; i++) {
            Vehiculo v = vehiculos[i];
            String mensaje =
                    "Marca: " + v.getMarca() +
                            ", Modelo: " + v.getModelo() +
                            ", Precio: " + v.getPrecio();
            System.out.println(mensaje);


//        System.out.println("\nLos 3 vehículos más caros:");
//        for (int i = 0; i < 3; i++) {
//            Vehiculo v = vehiculos[i];
//            System.out.println(v.toString()); // Uso de toString para imprimir la información
        }
        }
    }


