package org.example;

abstract class Electrodomestico {
    protected String codigo;
    protected String nombre;
    protected String marca;
    protected String modelo;
    protected String descripcion;
    protected int cantidad;
    protected double precioCosto;
    protected double precioVenta;

    public abstract void aumentarStock();
    public abstract void descontarStock();
    public abstract void vender();
}
