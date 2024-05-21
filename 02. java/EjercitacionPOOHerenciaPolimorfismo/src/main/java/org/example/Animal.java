package org.example;

public class Animal {

    private String nombre;
    private int edad;
    private String raza;

    private int cantExtremidades;

    public Animal() {
    }

    public Animal(String nombre, int edad, String raza, int cantExtremidades) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.cantExtremidades = cantExtremidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getCantExtremidades() {
        return cantExtremidades;
    }

    public void setCantExtremidades(int cantExtremidades) {
        this.cantExtremidades = cantExtremidades;
    }

    public String hacerSonido() {
        return "El animal hace un sonido";
    }

}
