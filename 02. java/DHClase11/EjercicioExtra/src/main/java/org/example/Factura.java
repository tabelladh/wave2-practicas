package org.example;

import java.util.List;

public class Factura {
    private Cliente cliente;
    private List<Producto> productos;
    private double total;

    public Factura() {

    }
    public Factura(Cliente cliente, List<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos;
        this.total = 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    private double calcularTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getCantidad() * item.getCostoUnitario();
        }
        return total;
    }
}
