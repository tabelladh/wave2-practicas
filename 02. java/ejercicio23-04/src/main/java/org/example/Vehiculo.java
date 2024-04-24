package org.example;

public class Vehiculo {

    private int idVehiculo, anioFabricacion, precio;
    private String marca, modelo, color;

    public Vehiculo() {
    }

    public Vehiculo(int idVehiculo, int anioFabricacion, int precio, String marca, String modelo, String color) {
        this.idVehiculo = idVehiculo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
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

    public String hacerService(){
        return "el service fue realizado";
    }

    public String otorgarGarantia(){
        return "la garantia fue entregada";
    }

    public String calibrarCubiertas(){
        return "las cubiertas fueron calibradas";
    }
}
