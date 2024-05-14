package org.example;

public class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String instagramDuenio;

    public Mascota(String nombre, String especie, String raza, int edad, String instagramDuenio) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.instagramDuenio = instagramDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getInstagramDuenio() {
        return instagramDuenio;
    }

    public void setInstagramDuenio(String instagramDuenio) {
        this.instagramDuenio = instagramDuenio;
    }

    public String getEspecie() {
        return especie;
    }
}
