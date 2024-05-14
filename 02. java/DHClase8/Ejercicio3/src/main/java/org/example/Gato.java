package org.example;

class Gato extends Animal implements IComerCarne {
    @Override
    public void emitirSonido() {
        System.out.println("Miau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Soy un gato y como carne");
    }
}
