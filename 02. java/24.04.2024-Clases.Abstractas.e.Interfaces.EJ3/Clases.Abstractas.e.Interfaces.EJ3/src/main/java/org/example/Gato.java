package org.example;

public class Gato extends Animal implements Carnivoro {
    @Override
    public void emitirSonido() {
        System.out.println("Miau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Soy un gato y como carne");
    }

    @Override
    public void comerAnimal(Animal animal) {
        comerCarne();
    }

}

