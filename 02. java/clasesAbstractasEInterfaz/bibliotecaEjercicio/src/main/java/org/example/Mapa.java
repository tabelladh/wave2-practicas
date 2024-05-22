package org.example;

public class Mapa extends Articulo implements INoPrestable{
    private String tipoDeMapa;
    private int tamanio;

    public Mapa() {
    }

    public Mapa(int codigo, String nombre, int anioPublicacion, String tipoDeMapa, int tamanio) {
        super(codigo, nombre, anioPublicacion);
        this.tipoDeMapa = tipoDeMapa;
        this.tamanio = tamanio;
    }

    public String getTipoDeMapa() {
        return tipoDeMapa;
    }

    public void setTipoDeMapa(String tipoDeMapa) {
        this.tipoDeMapa = tipoDeMapa;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Mapa{" +
                "tipoDeMapa='" + tipoDeMapa + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }

    @Override
    public String procedencia() {
        return "comprado";
    }


    @Override
    public String utilizarEnBiblioteca() {
        return "el mapa se utiliza en biblioteca";
    }

    @Override
    public String devolverEnBiblioteca() {
        return "el mapa se utiliza en biblioteca";
    }
}
