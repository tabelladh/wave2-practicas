package org.example;

public class Auto extends Vehiculo{
     int cantidadPuertas;
     int cantidadAsientos;
     int potenciaMotor;



    public Auto(int idVehiculo, String marca, String modelo, String color, int anioFabricaciion, double precio, int cantidadPuertas, int cantidadAsientos, int potenciaMotor) {
        super(idVehiculo, marca, modelo, color, anioFabricaciion, precio);
        this.cantidadPuertas = cantidadPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.potenciaMotor = potenciaMotor;

    }

    @Override
    public void hacerService() {
        System.out.println("Service de automóvil realizado correctamente.");
    }

    @Override
    public void otorgarGarantia() {
        System.out.println("Garantía de automóvil otorgada correctamente.");
    }

    @Override
    public void calibrarCubiertas() {
        System.out.println("Cubiertas de automóvil calibradas correctamente.");
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
}

