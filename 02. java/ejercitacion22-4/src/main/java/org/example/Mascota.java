package org.example;

public class Mascota {

    private String nombreMascota;
    private String especie;
    private String raza;
    private Integer edad;
    private String  instagramDueño;

    public Mascota(String nombreMascota, String especie, String raza, Integer edad, String instagramDueño) {
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.instagramDueño = instagramDueño;
    }

    public Mascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getInstagramDueño() {
        return instagramDueño;
    }

    public void setInstagramDueño(String instagramDueño) {
        this.instagramDueño = instagramDueño;
    }
}
