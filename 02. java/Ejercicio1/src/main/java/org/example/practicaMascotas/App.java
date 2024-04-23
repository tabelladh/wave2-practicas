package org.example.practicaMascotas;
public class App {
    public static void main(String[] args) {
        Mascota[] mascotasGanadoras = {
                new Mascota("Enzo", "perro", "Labrador", 3, "@duenio1"),
                new Mascota("Luna", "gato", "Siames", 2, "@duenio2"),
                new Mascota("Wanna", "perro", "Golden Retriever", 5, "@duenio3"),
                new Mascota("Felix", "gato", "Persa", 4, "@duenio4"),
                new Mascota("Simona", "perro", "Bulldog", 2, "@duenio5"),
                new Mascota("Simón", "gato", "Maine Coon", 7, "@duenio6"),
                new Mascota("Emma", "perro", "Chihuahua", 1, "@duenio7"),
                new Mascota("Milo", "perro", "Poodle", 4, "@duenio8"),
                new Mascota("Nala", "gato", "Angora", 6, "@duenio9"),
                new Mascota("Charlie", "perro", "Dálmata", 2, "@duenio10")
        };

        int perros = 0;
        int gatos = 0;
        int otros = 0;

        // Contamos la cantidad de cada especie
        for (Mascota mascota : mascotasGanadoras) {
            if (mascota.especie.equals("perro")) {
                perros++;
            } else if (mascota.especie.equals("gato")) {
                gatos++;
            } else {
                otros++;
            }
        }

        // Mostramos los resultados
        System.out.println("Perros ganadores: " + perros);
        System.out.println("Gatos ganadores: " + gatos);
        System.out.println("Otros: " + otros);
    }
}

