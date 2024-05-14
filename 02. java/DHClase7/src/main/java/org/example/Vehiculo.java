package org.example;

public class Vehiculo {
    // Atributos
    private int idVehiculo;
    private String marca;
    private String modelo;
    private String color;
    private int anioFabricacion;
    private double precio;

    // Constructor vacio

    public Vehiculo() {}
    // Constructor
    public Vehiculo(int idVehiculo, String marca, String modelo, String color, int anioFabricacion, double precio) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }

    // Métodos
    public void hacerService() {
        System.out.println("Service de vehículo realizado correctamente");
    }

    public void otorgarGarantia() {
        System.out.println("Garantía otorgada para este vehículo");
    }

    public void calibrarCubiertas() {
        System.out.println("Cubiertas calibradas correctamente");
    }

    // Getters y Setters
    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

