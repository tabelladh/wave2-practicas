package org.example.integrador;

import java.util.List;

public class Factura {
    private Cliente cliente;
    private List<Item> items;
    private Double total;

    public Factura(Cliente cliente, List<Item> items, Double total) {
        this.cliente = cliente;
        this.items = items;
        this.total = total;
    }
}
