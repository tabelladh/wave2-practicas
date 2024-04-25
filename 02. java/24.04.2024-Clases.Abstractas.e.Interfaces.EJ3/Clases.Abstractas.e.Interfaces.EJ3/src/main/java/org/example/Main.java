package org.example;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.emitirSonido();
        perro.comerCarne();

        Gato gato = new Gato();
        gato.emitirSonido();
        gato.comerCarne();

        Vaca vaca = new Vaca();
        vaca.emitirSonido();
        vaca.comerHierba();


        //Apartado por el metodo comerAnimal
        System.out.println("\nUsando el metodo 'comerAnimal' : \n ");

        Animal animal = new Perro();
        animal.comerAnimal(perro);


    }



}
