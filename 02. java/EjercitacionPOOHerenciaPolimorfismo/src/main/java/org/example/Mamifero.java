package org.example;

public class Mamifero extends Animal {

    private boolean tieneDientes;
    private String habitat; // 1 = terrestre, 2 = acuatica/

    public Mamifero() {

    }
    public Mamifero(String nombre, int edad, String raza, int cantExtremidades, boolean tieneDientes, String habitat) {
        super(nombre, edad, raza, cantExtremidades);
        this.tieneDientes = tieneDientes;
        this.habitat = habitat;
    }

    public boolean isTieneDientes() {
        return tieneDientes;
    }

    public void setTieneDientes(boolean tieneDientes) {
        this.tieneDientes = tieneDientes;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String amamantar() {

        return "El mamifero amamanta";
    }

}
