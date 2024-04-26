package org.example;


public class Gato extends Animal implements IComerCarne{

    public Gato() {
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau miau");
    }



    @Override
    public void comerCarne() {
        System.out.println("El gato come carne");
    }
}
