package org.example;

public class Perro extends Animal implements IComerCarne{

    public Perro() {
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }


    @Override
    public void comerCarne() {
        System.out.println("El perro come carne");
    }
}
