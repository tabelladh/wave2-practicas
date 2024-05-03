package org.example;

public class Perro extends Animal implements ICarnivoro{
    @Override
    public String emitirSonido() {
        return "soy un perro y hago guau";
    }

    @Override
    public void comerAnimal(Animal animal) {
        comerCarne();
    }

    @Override
    public void comerCarne() {
        System.out.println("soy perro y como carne");
    }
}
