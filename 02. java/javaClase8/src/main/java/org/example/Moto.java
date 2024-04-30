package org.example;

public class Moto extends Vehiculo {
    int cilindrada;



    public Moto(int idVehiculo, String marca, String modelo, String color, int anioFabricaciion, double precio, int cilindrada) {
        super(idVehiculo, marca, modelo, color, anioFabricaciion, precio);
        this.cilindrada = cilindrada;
    }
    @Override
    public void hacerService() {
        System.out.println("Service de motocicleta realizado correctamente.");
    }

    @Override
    public void otorgarGarantia() {
        System.out.println("Garantía de motocicleta otorgada correctamente.");
    }

    @Override
    public void calibrarCubiertas() {
        System.out.println("Cubiertas de motocicleta calibradas correctamente.");
    }


    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
