package org.example;

public class Mascota {

    String nombreMascota;
    String especie;
    String raza;
    int edad;
    String instagramDuenio;

    public Mascota() {
    }

    public Mascota(String nombreMascota, String especie, String raza, int edad, String instagramDuenio) {
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.instagramDuenio = instagramDuenio;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getEspecie() {
        return especie;
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

}


