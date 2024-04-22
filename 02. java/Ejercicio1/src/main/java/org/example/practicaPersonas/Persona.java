package org.example.practicaPersonas;

public class Persona {
    private String dni;
    private String nombre;
    private int edad;
    private int peso;
    private int altura;

    public Persona(String dni, String nombre, int edad, int peso, int altura) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {
    }

    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getPeso() {
        return peso;
    }
    public int getAltura() {
        return altura;
    }
}
