package org.example;

public class Oso extends Mamifero {

    private boolean hiberna;
    private String especie;
    private String colorPelaje;

    public Oso() {
    }
    public Oso(String nombre, int edad, String raza, int cantExtremidades, boolean tieneDientes, String habitat, boolean hiberna, String especie, String colorPelaje) {
        super(nombre, edad, raza, cantExtremidades, tieneDientes, habitat);
        this.hiberna = hiberna;
        this.especie = especie;
        this.colorPelaje = colorPelaje;
    }

    public boolean isHiberna() {
        return hiberna;
    }

    public void setHiberna(boolean hiberna) {
        this.hiberna = hiberna;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    @Override
    public String hacerSonido(){
        return "El oso hace un sonido: GRGRGR ";
    }

}
