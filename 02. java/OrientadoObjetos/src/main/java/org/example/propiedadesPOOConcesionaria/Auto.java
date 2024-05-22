package org.example.propiedadesPOOConcesionaria;

public class Auto extends Vehiculo {
    private int cantidadPuertas;
    private int cantidadAsientos;
    private int potenciaMotor;

    public Auto() {
    }

    public Auto(int idVehiculo, String marca, String modelo, String color, int anioFabricacion, double precio, int cantidadPuertas, int cantidadAsientos, int potenciaMotor) {
        super(idVehiculo, marca, modelo, color, anioFabricacion, precio);
        this.cantidadPuertas = cantidadPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.potenciaMotor = potenciaMotor;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
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

    @Override
    public void calibrarCubiertas() {
        System.out.println("Cubiertas de automóvil calibradas correctamente");
    }
}
