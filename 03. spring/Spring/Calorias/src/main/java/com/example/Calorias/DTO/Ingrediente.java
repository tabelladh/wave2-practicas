package com.example.Calorias.DTO;

public class Ingrediente {
    private String nombre;
    private double peso;
    private int calorias;

    public Ingrediente() {
    }

    public Ingrediente(String nombre, double peso, int calorias) {
        this.nombre = nombre;
        this.peso = peso;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
