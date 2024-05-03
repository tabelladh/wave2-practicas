package org.example;

public abstract class Electrodomestico {

    private int codigo,cantidad;
    private String nombre,modelo,descripcion;
    private double precioCosto,precioVenta;

    public Electrodomestico() {
    }

    public Electrodomestico(int codigo, int cantidad, String nombre, String modelo, String descripcion,
                            double precioCosto, double precioVenta) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    public abstract void aumentarStock();
    public abstract void descontarStock();
    public abstract void vender();

}
