package org.example;

public class Main {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Xavi", "perro", "bulldog", 4,"@dani");
        Mascota mascota2 = new Mascota("Zamba", "perro", "beagle", 8,"@jose");
        Mascota mascota3 = new Mascota("Max", "perro", "rotwa", 8,"@samti");
        Mascota mascota4 = new Mascota("Gea", "perro", "pitbull", 2,"@moni");
        Mascota mascota5 = new Mascota("Cachito", "gato", "sin", 9,"@aldi");
        Mascota mascota6 = new Mascota("Sina", "gato", "sin", 1,"@mariano");
        Mascota mascota7 = new Mascota("Loro", "loro", "sin", 4,"@almen");
        Mascota mascota8 = new Mascota("Sarita", "perro", "sin", 7,"@su");
        Mascota mascota9 = new Mascota("Berta", "gato", "sin", 3,"@olga");
        Mascota mascota10 = new Mascota("Lorito", "loro", "sin", 1,"@max");

        Mascota[] mascotas = new Mascota[10];

        mascotas[0] = mascota1;
        mascotas[1] = mascota2;
        mascotas[2] = mascota3;
        mascotas[3] = mascota4;
        mascotas[4] = mascota5;
        mascotas[5] = mascota6;
        mascotas[6] = mascota7;
        mascotas[7] = mascota8;
        mascotas[8] = mascota9;
        mascotas[9] = mascota10;

        int ganadoresPerros = 0;
        int ganadoresGatos = 0;
        int ganadoresLoros = 0;

        for (int i = 0; i < mascotas.length; i++) {
            Mascota datosMascotas = mascotas[i];
            String datoEspecie = datosMascotas.getEspecie();
            if(datoEspecie == "perro"){
                ganadoresPerros += 1;
            } else if (datoEspecie == "gato") {
                ganadoresGatos += 1;
            } else {
                ganadoresLoros += 1;
            }
        }

        System.out.println("Ganadores perros: " + ganadoresPerros);
        System.out.println("Ganadores gatos: " + ganadoresGatos);
        System.out.println("Ganadores loros: " + ganadoresLoros);
    }
}