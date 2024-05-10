package org.example;

public abstract class Electrodomestico {
    protected String codigo;
    protected String nombre;
    protected String marca;
    protected String modelo;
    protected String descripcion;
    protected int cantidad;
    protected double precioCosto;
    protected double precioVenta;

    //CONSTRUCTORES

    public Electrodomestico(){};

    public Electrodomestico(String codigo, String nombre, String marca, String modelo, String descripcion, double precioCosto, double precioVenta){
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }

    //GETTERS Y SETTERS
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    // Métodos abstractos
    public abstract  String aumentarStock();
    public abstract  String descontarStock();
    public abstract  String vender();
}


