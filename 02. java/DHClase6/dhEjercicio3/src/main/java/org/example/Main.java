package org.example;

public class Main {
    public static void main(String[] args) {
        Mascota[] mascotasGanadoras = new Mascota[10];

        // Llenar el vector con datos de ejemplo
        mascotasGanadoras[0] = new Mascota("Buddy", "Perro", "Golden Retriever", 5, "@dueño1");
        mascotasGanadoras[1] = new Mascota("Whiskers", "Gato", "Siamés", 3, "@dueño2");
        mascotasGanadoras[2] = new Mascota("Charlie", "Perro", "Chihuahua", 2, "@dueño3");
        mascotasGanadoras[3] = new Mascota("Coco", "Gato", "Persa", 4, "@dueño4");
        mascotasGanadoras[4] = new Mascota("Rocky", "Tortuga", "Tortuga de orejas rojas", 8, "@dueño5");
        mascotasGanadoras[5] = new Mascota("Max", "Conejo", "Conejo holandés", 1, "@dueño6");
        mascotasGanadoras[6] = new Mascota("Spike", "Iguana", "Iguana verde", 3, "@dueño7");
        mascotasGanadoras[7] = new Mascota("Whiskey", "Loro", "Loro cacatúa", 6, "@dueño8");
        mascotasGanadoras[8] = new Mascota("Nala", "Hamster", "Hamster sirio", 1, "@dueño9");
        mascotasGanadoras[9] = new Mascota("Coco", "Gato", "Persa", 4, "@dueño10");



        // Contadores para contar las cantidades de cada especie
        int perros = 0;
        int gatos = 0;
        int otros = 0;


        for (Mascota mascota : mascotasGanadoras) {
            if (mascota != null) {
                switch (mascota.getEspecie()) {
                    case "Perro":
                        perros++;
                        break;
                    case "Gato":
                        gatos++;
                        break;
                    default:
                        otros++;
                        break;
                }
            }
        }

        // Mostrar las cantidades por pantalla
        System.out.println("Perros ganadores: " + perros);
        System.out.println("Gatos ganadores: " + gatos);
        System.out.println("Otros: " + otros);
    }
}
