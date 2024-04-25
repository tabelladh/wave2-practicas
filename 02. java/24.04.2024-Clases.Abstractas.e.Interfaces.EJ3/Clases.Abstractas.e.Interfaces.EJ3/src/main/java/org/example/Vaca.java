package org.example;

public class Vaca extends Animal implements Herbivoro {
    @Override
    public void emitirSonido() {
        System.out.println("Muuu");
    }

    @Override
    public void comerHierba() {
        System.out.println("Soy una vaca y como hierba");
    }

    @Override
    public void comerAnimal(Animal animal) {
        comerHierba();
    }
}

