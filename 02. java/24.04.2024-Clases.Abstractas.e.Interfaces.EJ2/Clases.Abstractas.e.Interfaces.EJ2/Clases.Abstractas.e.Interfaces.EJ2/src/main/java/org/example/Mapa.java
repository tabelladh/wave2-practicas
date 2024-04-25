package org.example;

public class Mapa extends Articulo implements NoPrestable {

    private String tipoMapa;
    private String tamanio;

    public Mapa(String codigo, String nombre, int anoPublicacion, String tipoMapa, String tamanio) {
        super(codigo, nombre, anoPublicacion);
        this.tipoMapa = tipoMapa;
        this.tamanio = tamanio;
    }

    @Override
    public void utilizarEnBiblioteca() {
        System.out.println("Utilizando el mapa " + nombre + " en la biblioteca");
    }

    @Override
    public void devolverEnBiblioteca() {
        System.out.println("Mapa " + nombre + " devuelto en la biblioteca");
    }

}
