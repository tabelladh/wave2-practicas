package org.example;

public class Vaca extends Animal implements IHerbivoro{
    @Override
    public String emitirSonido() {
        return "soy una vaca y hago muuu";
    }

    @Override
    public void comerAnimal(Animal animal) {
        comerPasto();
    }

    @Override
    public void comerPasto() {
        System.out.println("soy vaca y como pasto");
    }
}
