package org.example;

import java.util.Scanner;

public class Auto extends Vehiculo {

    private int cantidadPuertas, cantidadAsientos, potenciaMotor;

    public Auto() {
    }

    public Auto(int idVehiculo, int anioFabricacion, int precio, String marca, String modelo, String color,
                int cantidadPuertas, int cantidadAsientos, int potenciaMotor) {
        super(idVehiculo, anioFabricacion, precio, marca, modelo, color);
        this.cantidadPuertas = cantidadPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.potenciaMotor = potenciaMotor;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public Auto agregar(){
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
        System.out.println("ingrese la cantidad de puertas");
        setCantidadPuertas(sc.nextInt());
        System.out.println("ingrese la cantidad de asientos");
        setCantidadAsientos(sc.nextInt());
        System.out.println("ingese la potencia del motor");
        setPotenciaMotor(sc.nextInt());
        sc.close();

        return new Auto();
    }

    @Override
    public String hacerService() {
        return "el service del auto fue realizado";
    }

    @Override
    public String otorgarGarantia() {
        return "la garantia del auto fue entregada";
    }

    @Override
    public String calibrarCubiertas() {
        return "las cubiertas del auto fueron calibradas";
    }
}
