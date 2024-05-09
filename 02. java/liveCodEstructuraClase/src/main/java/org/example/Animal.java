package org.example;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    //atributos
    String nombreAnimal;
    int edad;
    String raza;
    String especie;
    Double peso;


    // constructores
    public Animal() {
    }
    public Animal(String nombreAnimal, int edad, String raza, String especie, Double peso) {
        this.nombreAnimal = nombreAnimal;
        this.edad = edad;
        this.raza = raza;
        this.especie = especie;
        this.peso = peso;
    }

    //Metodos Getter y Setter

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal: " +
                "nombreAnimal= " + nombreAnimal +
                "\n edad=" + edad +
                "\n raza=" + raza +
                "\n especie= " + especie +
                "\n peso= " + peso ;
    }
}
