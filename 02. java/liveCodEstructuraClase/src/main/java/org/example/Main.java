package org.example;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal();

        animal1.setNombreAnimal("Perro");
        animal1.setEdad(5);
        animal1.setRaza("Pastor Aleman");
        animal1.setEspecie("Macho");
        animal1.setPeso(5.5);

        int a = 120;
        System.out.println(a);

        System.out.println(animal1);

        Animal animal2 = new Animal("Gato", 3, "Siames", "Hembra", 3.5);

        System.out.println("La edad del " + animal2.getNombreAnimal() + " es: " +animal2.getEdad());


    }
}