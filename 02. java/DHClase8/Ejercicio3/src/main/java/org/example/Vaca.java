package org.example;

class Vaca extends Animal implements IComerHierba {
    @Override
    public void emitirSonido() {
        System.out.println("Muuu");
    }


    @Override
    public void comerHierba() {
        System.out.println("Soy una vaca y como hierba");
    }
}
