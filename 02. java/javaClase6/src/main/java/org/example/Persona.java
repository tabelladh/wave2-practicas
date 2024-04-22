package org.example;

import java.util.SplittableRandom;
//Clase
public class Persona {
    int dni;
    String nombre;
    int edad;
    double peso;
    double altura;


    //constructores
    public Persona(){

    }

    public Persona(int dni, String nombre, int edad, double peso, double altura){

        this.dni=dni;
        this.nombre=nombre;
        this.edad= edad;
        this.peso=peso;
        this.altura=altura;
    }

    //Metodo get

    public int getDni(){
        return dni;
    }

    public String getNombre(){
        return  nombre;
    }

    public int getEdad() {
         return edad;
    }
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    //set

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
