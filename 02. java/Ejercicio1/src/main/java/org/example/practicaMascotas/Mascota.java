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

package org.example.practicaMascotas;

public class Mascota {
    String nombre;
    String especie;
    String raza;
    int edad;
    String instagramDuenio;

    public Mascota(String nombre, String especie, String raza, int edad, String instagramDuenio) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.instagramDuenio = instagramDuenio;
    }
}

