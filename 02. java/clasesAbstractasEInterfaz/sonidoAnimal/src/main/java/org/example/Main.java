package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();

        perro.hacerSonido();
        perro.comerCarne();

        System.out.println("--------------------------------");
        gato.hacerSonido();
        gato.comerCarne();

        System.out.println("--------------------------------");
        vaca.hacerSonido();
        vaca.comerHierba();
    }
}