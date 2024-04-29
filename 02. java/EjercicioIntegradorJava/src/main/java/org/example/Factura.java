package org.example;

import java.util.List;

public class Factura {
    private Cliente cliente;
    private List<String> listaItems;
    private Double importeTotal;

    public Factura() {
    }
    public Factura(Cliente cliente, List<String> listaItems, Double importeTotal) {
        this.cliente = cliente;
        this.listaItems = listaItems;
        this.importeTotal = importeTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<String> getListaItems() {
        return listaItems;
    }

    public void setListaItems(List<String> listaItems) {
        this.listaItems = listaItems;
    }

    public Double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(Double importeTotal) {
        this.importeTotal = importeTotal;
    }

}
