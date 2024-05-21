package org.example;

public class Mapa extends Articulo implements INoPrestable {

    private String tipoMapa;
    private int tamanio;

    public Mapa() {
    }

    public Mapa(int codigo, String nombre, int anio, String tipoMapa, int tamanio) {
        super(codigo, nombre, anio);
        this.tipoMapa = tipoMapa;
        this.tamanio = tamanio;
    }


    public String getTipoMapa() {
        return tipoMapa;
    }

    public void setTipoMapa(String tipoMapa) {
        this.tipoMapa = tipoMapa;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String procedencia() {
        return "Colegio";
    }

    @Override
    public String toString() {
        return "Mapa{" +
                "tipoMapa='" + tipoMapa + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }

    @Override
    public String utilizarEnBiblioteca() {
        return "Se utiliza en biblioteca el mapa";
    }

    @Override
    public String devolverEnBiblioteca() {
        return "Se utiliza en biblioteca el mapa";
    }
}
