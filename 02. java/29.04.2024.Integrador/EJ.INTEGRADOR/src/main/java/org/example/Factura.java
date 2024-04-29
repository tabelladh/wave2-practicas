package org.example;

import java.util.List;

public class Factura {

    private Cliente cliente;

    private List<Item> items;

    private double totalCompra;


    public Factura(Cliente cliente) {
                    }

    public Factura(Cliente cliente, List<Item> items, double totalCompra) {
        this.cliente = cliente;
        this.items = items;
        this.totalCompra = totalCompra;
    }
}
