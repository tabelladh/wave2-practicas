package org.example;


public class Main {
    public static void main(String[] args) {

        Mascota[] mascotaGanadoras = new Mascota[10];

        mascotaGanadoras[0] = new Mascota("Arthur", "perro", "labrador", 3, "pablo_val");
        mascotaGanadoras[1] = new Mascota("Luna", "gato", "siames", 2, "marce030");
        mascotaGanadoras[2] = new Mascota("Lola", "perro", "galgo", 5, "melivv");
        mascotaGanadoras[3] = new Mascota("Teodoro", "otro", "periquito", 7, "valzen");
        mascotaGanadoras[4] = new Mascota("Milton", "perro", "salchicha", 4, "maurmart");
        mascotaGanadoras[5] = new Mascota("Daisy", "gato", "angora", 2, "luluz");
        mascotaGanadoras[6] = new Mascota("Minnie", "gato", "siames", 3, "fedeval");
        mascotaGanadoras[7] = new Mascota("Moncho", "perro", "bulldog", 4, "nicooqui");
        mascotaGanadoras[8] = new Mascota("Poly", "otro", "betta", 0, "laului");
        mascotaGanadoras[9] = new Mascota("Kira", "otro", "guacamayo", 6, "mercheio");

        int perro = 0;
        int gato = 0;
        int otro = 0;

        for (Mascota mascota : mascotaGanadoras) {
            if (mascota.especie.equals("perro")) {
                perro++;
            } else if (mascota.especie.equals("gato")) {
                gato++;
            } else {
                otro++;
            }
        }

        System.out.println("Perros ganadores: " + perro);
        System.out.println("Gatos ganadores: " + gato);
        System.out.println("Otras especies ganadoras: " + otro);







    }
}