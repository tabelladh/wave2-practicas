package org.example;

public class Auto extends Vehiculo{
    int cantidadPuertas;
    int cantidadAsientos;
    int potenciaMotor;

    public Auto() {
        }

    public Auto(int idVehiculo, String marca, String modelo, String color, int anioFabricacion, double precio,
                int cantidadAsientos, int cantidadPuertas, int potenciaMotor) {
        super(idVehiculo, marca, modelo, color, anioFabricacion, precio);
        this.cantidadAsientos = cantidadAsientos;
        this.cantidadPuertas = cantidadPuertas;
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
        System.out.println("Service del vehiculo realizado correctamente");
    }
    @Override
    public void otorgarGarantia() {
        System.out.println("Garantia otorgada correctamente al vehiculo");
    }
    @Override
    public void calibrarCubiertas() {
        System.out.println("Cubiertas calibradas correctamente al vehiculo");
    }
}
