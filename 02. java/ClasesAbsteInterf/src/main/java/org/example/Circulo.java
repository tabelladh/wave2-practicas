package org.example;

public class Circulo extends Figura implements IConstantes {


    private double radio;
    public Circulo() {
    }

    public Circulo(int cantidadLado, double radio) {
        super(cantidadLado);
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return IConstantes.pi * (radio * radio);
    }
}
