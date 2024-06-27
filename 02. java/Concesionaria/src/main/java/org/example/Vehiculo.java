package org.example;

public class Vehiculo {
    int idVehiculo;
    String marca;
    String modelo;
    String color;
    int anioFabricacion;
    double precio;

    public Vehiculo(int idVehiculo, String marca, String modelo, String color, int anioFabricacion, double precio) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }

    public void hacerService() {
        System.out.println("Service de vehículo realizado correctamente");
    }

    public void otrorgarGarantia() {
        System.out.println("Garantía de 5 años con la compra de tu vehiculo");
    }

    public void calibrarCubiertas() {
        System.out.println("Cubiertas calibradas correctamente");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}