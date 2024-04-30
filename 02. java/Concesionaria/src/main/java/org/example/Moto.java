package org.example;

public class Moto extends Vehiculo {
    int cilindradad;

    public Moto(int idVehiculo, String marca, String modelo, String color, int anioFabricacion, double precio, int cilindrada) {
        super(idVehiculo, marca, modelo, color, anioFabricacion, precio);
        this.cilindradad = cilindradad;
    }

    @Override
    public void hacerService() {
        System.out.println("Service de Motocicleta realizado correctamente");
    }
    @Override
     public void otrorgarGarantia() {
        System.out.println ("Garantía de 3 años con la compra de tu Motocicleta");
    }
}
