package org.example;

public abstract class Figura {    
    protected int cantidadLado;
    
    public Figura() {
    }
    public Figura(int cantidadLado) {
        this.cantidadLado = cantidadLado;
    }

    public int getcantidadLado() {
        return cantidadLado;
    }

    public void setcantidadLado(int cantidadLado) {
        this.cantidadLado = cantidadLado;
    }
    
    public abstract Double calcularArea();

    
}
