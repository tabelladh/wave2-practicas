package org.example;

public class Vaca extends Animal implements IComerHierba{

    public Vaca() {
    }

    @Override
    public void hacerSonido() {
        System.out.println("muuu");
    }

    @Override
    public void comerHierba() {
        System.out.println("La vaca come hierba");
    }
}
