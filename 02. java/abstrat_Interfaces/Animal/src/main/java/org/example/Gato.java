package org.example;

public class Gato extends Animal implements ICarnivoro{
    String raza;
    String color;

    public Gato(String color, String raza) {
        this.color = color;
        this.raza = raza;
    }

    public Gato() {

    }

    @Override
    public void emitirSonido() {
        System.out.println("El gato hace Miau");
    }
    @Override
    public void comerCarne() {
        System.out.println("Soy una gato y como carne");
    }
}
