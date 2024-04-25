package org.example;

public class Perro extends Animal implements Carnivoro {
    @Override
    public void emitirSonido() {
        System.out.println("Guau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Soy un perro y como carne");
    }

    @Override
    public void comerAnimal(Animal animal) {
        comerCarne();
    }
}

