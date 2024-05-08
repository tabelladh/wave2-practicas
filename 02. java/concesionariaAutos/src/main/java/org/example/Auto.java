package org.example;

public class Auto extends Vehiculo{
    private int cantidadPuertas;
    private int cantidadAsientos;
    private int potenciaMotor;

    //CONSTRUCTOR
    public Auto(int idVehiculo, String marca, String modelo, String color, int anioFabricacion, double precio, int cantidadAsientos, int cantidadPuertas, int potenciaMotor){
        super(idVehiculo, marca, modelo, color, anioFabricacion, precio);
        this.cantidadAsientos = cantidadAsientos;
        this.cantidadPuertas = cantidadPuertas;
        this.potenciaMotor = potenciaMotor;
    }


    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void calibrarCubiertas() {
        System.out.println("Cubiertas de automóvil calibradas correctamente");
    }
    @Override
    public String toString() {
        return "Auto: Id=" + getIdVehiculo() + ", Marca=" + getMarca() + ", Modelo=" + getModelo() + ", Color=" + getColor() + ", Precio=" + getPrecio();
    }
}
