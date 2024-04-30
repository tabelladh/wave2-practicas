package org.example;

public class Auto extends Vehiculo {
    int cantPuertas;
    int cantAsientos;
    int potenciaMotor;

    public Auto(int idVehiculo, String marca, String modelo, String color, int anioFabricacion, double precio, int cantPuertas, int cantAsientos, int potenciaMotor) {
        super(idVehiculo, marca, modelo, color, anioFabricacion, precio);
        this.cantPuertas = cantPuertas;
        this.cantAsientos = cantAsientos;
        this.potenciaMotor = potenciaMotor;
    }


    @Override
    public void hacerService() {
        System.out.println ("Service de Automovil realizado correctamente");
    }
    @Override
    public void otrorgarGarantia() {
        System.out.println ("Garantía de 5 años con la compra de tu Automvil");
    }

}
