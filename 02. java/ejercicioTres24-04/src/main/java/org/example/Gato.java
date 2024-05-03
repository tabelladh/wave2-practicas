package org.example;

public class Gato extends Animal implements ICarnivoro{
    @Override
    public String emitirSonido() {
        return "soy un gato y hago miau";
    }

    @Override
    public void comerAnimal(Animal animal) {
        comerCarne();
    }

    @Override
    public void comerCarne() {
        System.out.println("soy gato y como carne");
    }
}
