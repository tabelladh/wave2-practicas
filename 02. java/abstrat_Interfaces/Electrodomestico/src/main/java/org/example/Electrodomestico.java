package org.example;

public abstract class Electrodomestico{
    int codigo;
    String nombre;
    String marca;
    String modelo;
    String descripcion;
    int cantidad;
    int precioCosto;
    int precioVenta;

    public Electrodomestico(String nombre, int codigo, String marca, String modelo, int cantidad, String descripcion, int precioCosto, int precioVenta) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }


    public void aumentarStock() {
    }
    public void descontarStock() {

    }
    public void vender() {

    }

}
