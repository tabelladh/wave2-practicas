package org.example;

public class Perro extends Animal implements ICarnivoro{
    String raza;
    String color;


    public Perro(String color, String raza) {
        this.color = color;
        this.raza = raza;
    }

    public Perro() {

    }

    @Override
    public void emitirSonido() {
        System.out.println("El perro hace Guau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Soy un perro y como carne");
    }
}
