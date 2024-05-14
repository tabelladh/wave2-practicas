package org.example;

public class Moto extends Vehiculo {
    // Atributo propio de Moto
    private int cilindrada;

    // Constructor vacio

    public Moto() {}
    // Constructor de Moto
    public Moto(int idVehiculo, String marca, String modelo, String color, int anioFabricacion, double precio, int cilindrada) {
        super(idVehiculo, marca, modelo, color, anioFabricacion, precio);
        this.cilindrada = cilindrada;
    }

    // Método específico de Moto
    @Override
    public void hacerService() {
        System.out.println("Service de motocicleta realizado correctamente");
    }

    // Getters y Setters

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
