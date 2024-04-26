package org.example;

public class Moto extends Vehiculo {

    int cilindrada;

    public Moto() {
    }

    public Moto(int idVehiculo, String marca, String modelo, String color, int anioFabricacion, double precio, int cilindrada) {
        super(idVehiculo, marca, modelo, color, anioFabricacion, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void hacerService() {
        System.out.println("Service de moto realizado correctamente");
    }
    @Override
    public void otorgarGarantia() {
        System.out.println("Garantia otorgada correctamente a la moto");
    }
    @Override
    public void calibrarCubiertas() {
        System.out.println("Cubiertas calibradas correctamente a la moto");
    }

}

