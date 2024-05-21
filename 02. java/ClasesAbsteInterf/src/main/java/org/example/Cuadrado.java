package org.example;

public class Cuadrado extends Figura{

    private Double tamaniolado;

    public Cuadrado() {
    }

    public Cuadrado(int cantidadLado, Double tamaniolado) {
        super(cantidadLado);
        this.tamaniolado = tamaniolado;
    }

    public Double getTamaniolado() {
        return tamaniolado;
    }

    public void setTamaniolado(Double tamaniolado) {
        this.tamaniolado = tamaniolado;
    }

    @Override
    public Double calcularArea() {
        return tamaniolado*tamaniolado;
    }


}
