package org.example;

public class Moto extends Vehiculo {
    private int cilindrada;

    //CONSTRUCTOS CON LOS ATRIBUTOS DE LA CLASE VEHICULO MAS EL DE MOTO
    public Moto(int idVehiculo, String marca, String modelo, String color, int anioFabricacion, double precio, int cilindrada) {
        super(idVehiculo, marca, modelo, color, anioFabricacion, precio);
        this.cilindrada = cilindrada;
    }

    //METO HACER SERVICE EXCLUSIVO PARA MOTO
    @Override
    public void hacerService(){
        System.out.println("Service de motocicleta realizado correctamente");
    }

    //GETTERS Y SETTERS


    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto: Id=" + getIdVehiculo() + ", Marca=" + getMarca() + ", Modelo=" + getModelo() + ", Color=" + getColor() + ", Precio=" + getPrecio();
    }
}
