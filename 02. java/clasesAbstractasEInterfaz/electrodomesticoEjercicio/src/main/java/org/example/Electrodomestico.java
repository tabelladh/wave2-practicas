package org.example;

public abstract class Electrodomestico {
   protected int codigo;
   protected String nombre;
   protected String marca;
   protected String modelo;
   protected String descripcion;
   protected int cantidad;
   protected Double precioCosto;
   protected Double precioVenta;

    public Electrodomestico(int codigo, String nombre, String marca, String modelo, String descripcion, int cantidad, Double precioCosto, Double precioVenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }

    public Electrodomestico() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    public Double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(Double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String toString() {
        return "Electrodomestico{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioCosto=" + precioCosto +
                ", precioVenta=" + precioVenta +
                '}';
    }

    public abstract String aumentarStock();
    public abstract String descontarStock();
    public abstract String vender();
}
