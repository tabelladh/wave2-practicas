package org.example;

public abstract class Articulo {

    private int idProducto;

    public Articulo() {
    }

    public Articulo(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public abstract void imprimir();
}
