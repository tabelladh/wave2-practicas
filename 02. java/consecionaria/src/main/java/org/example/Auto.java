package org.example;

public class Auto extends Vehiculo {
    int cantidadPuertas;
    int cantidadAsientos;
    int potenciaMotor;

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
    public void hacerService(){
        System.out.println("Service de auto realizado correctamente");
    }
    public void otorgarGarantias(){
        System.out.println("Este auto cuenta con garantia");
    }

    public void calibrarCubiertas(){
        System.out.println("Se calibraron las cubiertas del auto");
        }
}
