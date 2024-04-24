package org.example;

public class Auto extends Vehiculo {
    private int cantidadPuertas;
    private int cantidadAsientos;
    private double potenciaMotor;

    public Auto(int idVehiculo, String marca, String modelo, String color, int anioFabricacion, double precio, int cantidadPuertas, int cantidadAsientos, double potenciaMotor) {
        super(idVehiculo, marca, modelo, color, anioFabricacion, precio);
        this.cantidadPuertas = cantidadPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public void hacerService() {
        System.out.println("Service de automóvil realizado correctamente");
    }

    @Override
    public void otorgarGarantia() {
        System.out.println("Garantía de automóvil otorgada correctamente");
    }

    @Override
    public void calibrarCubiertas() {
        System.out.println("Calibración de cubiertas de automóvil realizada correctamente");
    }
}
