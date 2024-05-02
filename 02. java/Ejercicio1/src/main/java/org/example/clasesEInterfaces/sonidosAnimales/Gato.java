package org.example.clasesEInterfaces.sonidosAnimales;

class Gato extends Animal implements Carnivoro {

    public Gato() {
    }

    @Override
    void emitirSonido() {
        System.out.println("Miau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Soy un gato y como carne");
    }
}