package org.example;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(int idVehiculo, String marca, String modelo, String color, int anioFabricacion, double precio, int cilindrada) {
        super(idVehiculo, marca, modelo, color, anioFabricacion, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public void hacerService() {
        System.out.println("Service de motocicleta realizado correctamente");
    }

    @Override
    public void otorgarGarantia() {
        System.out.println("Garantía de motocicleta otorgada correctamente");
    }

    @Override
    public void calibrarCubiertas() {
        System.out.println("Calibración de cubiertas de motocicleta realizada correctamente");
    }
}
