package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vaca vaca = new Vaca(2500.0, "Holandes");
        Perro perro = new Perro("Labrador", "Amarrillo");
        Gato gato = new Gato("Marron", "siames");

        gato.emitirSonido();
        gato.comerCarne();
        vaca.emitirSonido();
        vaca.comerHierba();
        perro.emitirSonido();
        perro.comerCarne();
    }

}