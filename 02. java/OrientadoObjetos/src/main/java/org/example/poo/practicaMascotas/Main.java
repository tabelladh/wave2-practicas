/*
Una clínica veterinaria realizó un sorteo de instagram entre todos sus seguidores que
incluía un total de 10 premios. Cada uno de los 10 premios fueron entregados a diferentes
 cuyos datos que fueron pedidos para participar fueron: nombre_mascota, especie (perro, gato, etc),
 raza, edad, instagram_duenio (usuario de Instagram del dueño).
Como los premios a otorgar dependen del tipo de mascota, la veterinaria necesita determinar,
de entre los 10 ganadores, cuántos son perros, cuántos son gatos y cuántos son de otra especie.
Realizar un programa que, a partir del almacenamiento de las 10 mascotas ganadoras en un vector,
determine las cantidades de cada especie. Luego de esto, mostrar dichas cantidades por pantalla.
Por ejemplo: Perros ganadores: 5 Gatos ganadores: 2 Otros: 3
Tener en cuenta que las 10 mascotas que se almacenan en el vector ya son las ganadoras (no hay que sortear ni hacer ningún otro proceso).
Tener en cuenta que en caso de que sea cualquier especie diferente a perro o gato (sin importar cual) deberá sumar cantidad a “otros”.
*/

package org.example.poo.practicaMascotas;
public class Main {
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
        System.out.println("Perros ganadores: " + perros);
        System.out.println("Gatos ganadores: " + gatos);
        System.out.println("Otros: " + otros);
    }
}

