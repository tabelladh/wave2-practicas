package org.example;

public class Item {

    private String código;
    private String nombre;
    private Integer cantidadComprada;
    private Double costoUnitario;

    public Item(String código, String nombre, Integer cantidadComprada, Double costoUnitario) {
        this.código = código;
        this.nombre = nombre;
        this.cantidadComprada = cantidadComprada;
        this.costoUnitario = costoUnitario;
    }

    public Item() {
    }
}
