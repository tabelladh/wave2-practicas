package org.example;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();

        System.out.print("Perro: ");
        perro.emitirSonido();
        perro.comerCarne();

        System.out.print("Gato: ");
        gato.emitirSonido();
        gato.comerCarne();

        System.out.print("Vaca: ");
        vaca.emitirSonido();
        vaca.comerHierba();
    }
}