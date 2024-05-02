package org.example.propiedadesPOOConcesionaria;

public class Moto extends Vehiculo{
    private int cilindrada;

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
        System.out.println("Service de motocicleta realizado correctamente");
    }
}

