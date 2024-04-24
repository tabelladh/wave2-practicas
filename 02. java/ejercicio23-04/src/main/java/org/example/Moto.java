package org.example;

import java.util.Scanner;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto() {
    }

    public Moto(int idVehiculo, int anioFabricacion, int precio, String marca, String modelo, String color, int cilindrada) {
        super(idVehiculo, anioFabricacion, precio, marca, modelo, color);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Moto agregar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el id");
        setIdVehiculo(sc.nextInt());
        System.out.println("ingrese el anio de fabricacion");
        setAnioFabricacion(sc.nextInt());
        System.out.println("ingrese el precio");
        setPrecio(sc.nextInt());
        System.out.println("ingrese la marca");
        setMarca(sc.next());
        System.out.println("ingrese el modelo");
        setModelo(sc.next());
        System.out.println("ingrese el color");
        setColor(sc.next());
        System.out.println("ingrese la cilindrada");
        setCilindrada(sc.nextInt());
        sc.close();

        return new Moto();
    }

    @Override
    public String calibrarCubiertas() {
        return "las cubiertas de la motociclete fueron calibradas";
    }

    @Override
    public String otorgarGarantia() {
        return "la garantia de la motociclete fue entregada";
    }

    @Override
    public String hacerService() {
        return "el service de la motociclete fue realizado";
    }
}
