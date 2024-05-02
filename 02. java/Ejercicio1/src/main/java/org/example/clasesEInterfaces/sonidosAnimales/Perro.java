package org.example.clasesEInterfaces.sonidosAnimales;

class Perro extends Animal implements Carnivoro {

    public Perro() {
    }

    @Override
    void emitirSonido() {
        System.out.println("Guau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Soy un perro y como carne");
    }
}