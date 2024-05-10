package org.example;


public class Main {
    // Método para comer cualquier tipo de animal
    public static String comerAnimal(Animal animal) {
        if (animal instanceof Alimentacion) {
           return ((Alimentacion) animal).comerCarne();
        } else if (animal instanceof AlimentacionTipo2) {
            return ((AlimentacionTipo2) animal).comerHierba();
        }

        return "No come";
    }

    public static void main(String[] args) {
        Perro perro = new Perro("Zamba");
        Gato gato = new Gato("Garfield");
        Vaca vaca = new Vaca("Lola");

        // Emitir sonidos de los animales
        System.out.println(perro.emitirSonido());
        System.out.println(gato.emitirSonido());
        System.out.println( vaca.emitirSonido());

        // Comer
        System.out.println(comerAnimal(perro));
        System.out.println(comerAnimal(gato));
        System.out.println(comerAnimal(vaca));
    }
}