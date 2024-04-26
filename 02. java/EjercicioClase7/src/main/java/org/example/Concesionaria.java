package org.example;


import java.util.Scanner;

public class Concesionaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Vehiculo[] vehiculosALaVenta = new Vehiculo[10];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los datos del auto al stock : \n");
            vehiculosALaVenta[i] = ingresarVehiculo(sc, "auto");
        }

        for (int i = 5; i < 10; i++) {
            System.out.println("Ingrese los datos de la moto al stock : \n");
            vehiculosALaVenta[i] = ingresarVehiculo(sc, "moto");

        }

        Vehiculo[] losMasCaritos = ordenarPorPrecio(vehiculosALaVenta);

        System.out.println("Los tres vehículos más caros son: \n");
        for (Vehiculo vehiculosALaventa : losMasCaritos) {
            System.out.println(vehiculosALaventa);
            vehiculosALaventa.hacerService();
        }




    }

    public static Vehiculo ingresarVehiculo(Scanner sc, String tipoVehiculo) {
        System.out.println("Ingrese ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese marca: ");
        String marca = sc.nextLine();

        System.out.println("Ingrese modelo: ");
        String modelo = sc.nextLine();

        System.out.println("Ingrese color: ");
        String color = sc.nextLine();

        System.out.println("Ingrese año de fabricacion: ");
        int anioFabricacion = sc.nextInt();

        System.out.println("Ingrese precio: ");
        double precio = sc.nextDouble();

        if (tipoVehiculo.equals("moto")) {
            System.out.println("Cilindrada: ");
            int cilindrada = sc.nextInt();
            return new Moto(id, marca, modelo, color, anioFabricacion, precio, cilindrada);
        } else if (tipoVehiculo.equals("auto")) {

            System.out.println("Cantidad de Puertas: ");
            int cantidadPuertas = sc.nextInt();

            System.out.println("Cantidad de asientos: ");
            int cantidadAsientos = sc.nextInt();

            System.out.println("Potencia del motor: ");
            int potenciaMotor = sc.nextInt();
            return new Auto(id, marca, modelo, color, anioFabricacion, precio, cantidadPuertas, cantidadAsientos, potenciaMotor);
        }

        return null;
    }

    public static Vehiculo[] ordenarPorPrecio(Vehiculo[] vehiculosAlaVenta) {
        for (int i = 0; i < vehiculosAlaVenta.length - 1; i++) {
            for (int j = 0; j < vehiculosAlaVenta.length - 1 - i; j++) {
                if (vehiculosAlaVenta[j].precio < vehiculosAlaVenta[j + 1].precio) {
                    Vehiculo aux = vehiculosAlaVenta[j + 1];
                    vehiculosAlaVenta[j + 1] = vehiculosAlaVenta[j];
                    vehiculosAlaVenta[j] = aux;
                }
            }

        }

        Vehiculo[] losMasCaritos = new Vehiculo[3];
            for (int i = 0; i < 3; i++) {
               losMasCaritos[i] = vehiculosAlaVenta[i];
            }
            return losMasCaritos;
        }

    }



