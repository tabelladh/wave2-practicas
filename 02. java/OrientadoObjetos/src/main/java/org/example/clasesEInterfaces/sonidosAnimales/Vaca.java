package org.example.clasesEInterfaces.sonidosAnimales;

class Vaca extends Animal implements Herbivoro {

    public Vaca() {
    }

    @Override
    void emitirSonido() {
        System.out.println("Muuu");
    }

    @Override
    public void comerHierba() {
        System.out.println("Soy una vaca y como hierba");
    }
}
