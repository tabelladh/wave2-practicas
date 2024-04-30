package org.example;

public class Veterinaria {

    public static void main(String[] args) {
        Mascota[] mascotasGanadoras = new Mascota[10];


        mascotasGanadoras[0] = new Mascota("Toby", "Perro", "Labrador", 5, "dueño1");
        mascotasGanadoras[1] = new Mascota("Luna", "Gato", "Siamés", 3, "dueño2");
        mascotasGanadoras[2] = new Mascota("Max", "Loro", "Yaco", 10, "dueño3");
        mascotasGanadoras[3] = new Mascota("Bobby", "Conejo", "Holandés", 2, "dueño4");
        mascotasGanadoras[4] = new Mascota("Whiskers", "Hamster", "Ruso", 1, "dueño5");
        mascotasGanadoras[5] = new Mascota("Leonardo", "Tortuga", "Galápagos", 50, "dueño6");
        mascotasGanadoras[6] = new Mascota("Godzilla", "Iguana", "Verde", 4, "dueño7");
        mascotasGanadoras[7] = new Mascota("Nemo", "Pez", "Payaso", 1, "dueño8");
        mascotasGanadoras[8] = new Mascota("Tweety", "Canario", "Amarillo", 2, "dueño9");
        mascotasGanadoras[9] = new Mascota("Rex", "Perro", "Pastor Alemán", 7, "dueño10");


        int contadorPerros = 0;
        int contadorGatos = 0;
        int contadorOtros = 0;


        for (Mascota mascota : mascotasGanadoras) {
            String especieActual = mascota.getEspecie();
            switch (especieActual.toLowerCase()) {
                case "perro":
                    contadorPerros++;
                    break;
                case "gato":
                    contadorGatos++;
                    break;
                default:
                    contadorOtros++;
                    break;
            }
        }


        System.out.println("Perros ganadores: " + contadorPerros);
        System.out.println("Gatos ganadores: " + contadorGatos);
        System.out.println("Otras especies ganadoras: " + contadorOtros);
    }
}
