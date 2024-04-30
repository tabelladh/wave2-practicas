package org.example;

public class Vehiculo {
      int idVehiculo;
      String marca;
      String modelo;
      String color;
      int anioFabricaciion;
      double precio;

    public Vehiculo() {
    }

    public Vehiculo(int idVehiculo, String marca, String modelo, String color, int anioFabricaciion, double precio) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anioFabricaciion = anioFabricaciion;
        this.precio = precio;
    }
    public void hacerService() {
        System.out.println("Service de vehículo realizado correctamente.");
    }

    public void otorgarGarantia() {
        System.out.println("Garantía de vehículo otorgada correctamente.");
    }

    public void calibrarCubiertas() {
        System.out.println("Cubiertas de vehículo calibradas correctamente.");
    }

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

    public int getAnioFabricaciion() {
        return anioFabricaciion;
    }

    public void setAnioFabricaciion(int anioFabricaciion) {
        this.anioFabricaciion = anioFabricaciion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
