package org.example;

public class VehiculoGral {

    int idVehiculo;
    String marca;
    int modelo;
    String color;
    int anioFabricacion;
    int precio;

    public VehiculoGral() {
    }

    public VehiculoGral(int idVehiculo, String marca, int modelo, String color, int anioFabricacion, int precio) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
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

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void hacerService() {
        System.out.println ("Service de Vehiculo realizado correctamente");
    }

    public void otorgarGarantia() {
        System.out.println("Garantia de Vehiculo otorgada");
    }

    public void calibrarCubiertas() {
        System.out.println("Cubiertas del Vehiculo calibradas");
    }

    @Override
    public String toString() {
        return "VehiculoGral{" +
                "idVehiculo=" + idVehiculo +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", color='" + color + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                ", precio=" + precio +
                '}';
    }
}
