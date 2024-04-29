package org.example;

public class Auto extends VehiculoGral {

    int cantidadPuertas;
    int cantidadAsientos;
    int potenciaMotor;

    public Auto() {
    }

    public Auto(int idVehiculo, String marca, int modelo, String color, int anioFabricacion, int precio, int cantidadPuertas, int cantidadAsientos, int potenciaMotor) {
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
    @Override
    public void hacerService() {
        System.out.println ("Service de Auto realizado correctamente");
    }
    @Override
    public void otorgarGarantia() {
        System.out.println("Garantia de Auto otorgada");
    }
    @Override
    public void calibrarCubiertas() {
        System.out.println("Cubiertas del Auto calibradas");
    }


}
