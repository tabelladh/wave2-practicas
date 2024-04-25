package org.example;

public class Revista extends Articulo implements NoPrestable {

    private int numeroEdicion;
    private String mes;

    public Revista(String codigo, String nombre, int anoPublicacion, int numeroEdicion, String mes) {
        super(codigo, nombre, anoPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.mes = mes;
    }

    @Override
    public void utilizarEnBiblioteca() {
        System.out.println("Utilizando la revista " + nombre + " en la biblioteca");
    }

    @Override
    public void devolverEnBiblioteca() {
        System.out.println("Revista " + nombre + " devuelta en la biblioteca");
    }


}
