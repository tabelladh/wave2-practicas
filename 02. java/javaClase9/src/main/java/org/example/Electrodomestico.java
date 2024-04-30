package org.example;

public  abstract class Electrodomestico {
    int codigo;
    String nombre;
    String marca;
    String modelo;
    String descripcion;
    int cantidad;
    double precioCosto;
    double precioVenta;

    public Electrodomestico(int codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, double precioCosto, double precioVenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Código: " + codigo + "\n" +
                "Nombre: " + nombre + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Cantidad en stock: " + cantidad + "\n" +
                "Precio de costo: $" + precioCosto + "\n" +
                "Precio de venta: $" + precioVenta + "\n";
    }

    //metodos abstractos
    abstract void aumentarStock(int cantidad);
    abstract void descontarStock(int cantidad);
    abstract void vender();



}



