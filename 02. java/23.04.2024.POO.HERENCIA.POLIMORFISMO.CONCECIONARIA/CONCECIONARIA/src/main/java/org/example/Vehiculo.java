package org.example;

public class Vehiculo {
    private int idVehiculo;
    private String marca;
    private String modelo;
    private String color;
    private int anioFabricacion;
    private double precio;

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
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

    public void otorgarGarantia() {
        System.out.println("Garantía otorgada correctamente");
    }

    public void calibrarCubiertas() {
        System.out.println("Calibración de cubiertas realizada correctamente");
    }
}

