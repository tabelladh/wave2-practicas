package org.example;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();
        System.out.println(perro.emitirSonido());
        perro.comerAnimal(perro);
    }
}
