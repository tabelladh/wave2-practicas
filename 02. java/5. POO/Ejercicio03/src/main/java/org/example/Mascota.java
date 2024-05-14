package org.example;

public class Mascota {

    private String nombreMascota;
    private String especie;
    private String raza;
    private int edad;
    private String igDuenio;

    public Mascota() {
    }

    public Mascota(String nombreMascota, String especie, String raza, int edad, String igDuenio) {
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.igDuenio = igDuenio;
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

    public String getIgDuenio() {
        return igDuenio;
    }

    public void setIgDuenio(String igDuenio) {
        this.igDuenio = igDuenio;
    }
}
