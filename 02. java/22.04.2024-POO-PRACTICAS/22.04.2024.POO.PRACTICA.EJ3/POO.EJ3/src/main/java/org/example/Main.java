package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Mascota[] mascotas = new Mascota[10];
        Random random = new Random();
        int ctaPerros=0, ctaGatos=0, ctaOtros=0;

        String[] nombres = {"Fido", "Rex", "Spot", "Max", "Bella"};
        String[] especies = {"Perro", "Gato", "Pájaro", "Pez", "Reptil"};
        String[] razas = {"Labrador", "Siames", "Canario", "Goldfish", "Iguana"};
        String[] instagrams = {"@fido", "@rex", "@spot", "@max", "@bella"};

        for (int i = 0; i < mascotas.length; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            String especie = especies[random.nextInt(especies.length)];
            String raza = razas[random.nextInt(razas.length)];
            int edad = random.nextInt(15);
            String instagram = instagrams[random.nextInt(instagrams.length)];

            mascotas[i] = new Mascota(nombre, especie, raza, edad, instagram);

        }

        for (Mascota mascota : mascotas) {
            String especie = mascota.getEspecie();

            if (especie.equalsIgnoreCase("Perro")) {
                ctaPerros++;
            } else if (especie.equalsIgnoreCase("Gato")) {
                ctaGatos++;
            } else {
                ctaOtros++;
            }
        }

        System.out.println("Cantidad de Perros: " + ctaPerros);
        System.out.println("Cantidad de Gatos: " + ctaGatos);
        System.out.println("Cantidad de Otros: " + ctaOtros);




    }
}