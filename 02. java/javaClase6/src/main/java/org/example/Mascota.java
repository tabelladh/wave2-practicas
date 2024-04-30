package org.example;

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


    public String getEspecie() {
        return especie;
    }


    public void setEspecie(String especie) {
        this.especie = especie;
    }
}

