package org.example;

public class Moto extends VehiculoGral{

    int cilindrada;

    public Moto() {
    }

    public Moto(int idVehiculo, String marca, int modelo, String color, int anioFabricacion, int precio, int cilindrada) {
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
        System.out.println ("Service de Moto realizado correctamente");
    }
    @Override
    public void otorgarGarantia() {
        System.out.println("Garantia de Moto otorgada");
    }
    @Override
    public void calibrarCubiertas() {
        System.out.println("Cubiertas de la Moto calibradas");
    }


}
