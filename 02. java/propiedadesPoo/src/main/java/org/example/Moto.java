package org.example;

public class Moto extends Vehiculo{
String cilindrada;

    public Moto(int idVehiculo, String marca, String modelo, String color, int anioFabricacion, double precio, String cilindrada) {
        super(idVehiculo, marca, modelo, color, anioFabricacion, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
public void hacerService(){
    System.out.println("Service de motocicleta realizado correctamente");
}
}
