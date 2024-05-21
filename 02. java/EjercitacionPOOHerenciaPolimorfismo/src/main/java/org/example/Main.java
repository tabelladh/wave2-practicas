package org.example;

public class Main {
    public static void main(String[] args) {


        Alumno alumno = new Alumno(1, 12345678, "Juan", "Perez");

        //System.out.println(alumno.getNombre());

        Animal animal1 = new Animal("Perro", 2, "Chihuahua", 4);

        Mamifero mamifero1 = new Mamifero("Gato", 3, "Siames", 4, true, "Terrestre");

        Oso oso1 = new Oso("Oso", 4, "Polar", 4, true, "Terrestre", true, "Hemisferio Norte", "Blanco");

        Animal animal2 = new Animal("Loro", 30, "Cacatua", 2);

        System.out.println(animal1.hacerSonido());

        System.out.println(oso1.hacerSonido());

        Animal [] vectorAnimales = new Animal[4];

        vectorAnimales[0] = animal1;
        vectorAnimales[1] = mamifero1;
        vectorAnimales[2] = oso1;
        vectorAnimales[3] = animal2;


    }
}