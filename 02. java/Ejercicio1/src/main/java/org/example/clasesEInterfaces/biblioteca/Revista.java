package org.example.clasesEInterfaces.biblioteca;

class Revista extends ArticuloBiblioteca implements NoPrestable {
    private int numeroEdicion;
    private String mes;

    public Revista() {
    }

    public Revista(String codigo, String nombre, int añoPublicacion, int numeroEdicion, String mes) {
        super(codigo, nombre, añoPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.mes = mes;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String utilizarEnBiblioteca() {
        return ("Revista " + getNombre() + " utilizada en la biblioteca.");
    }

    @Override
    public String devolverEnBiblioteca() {
        return ("Revista " + getNombre() + " devuelta en la biblioteca.");
    }

    // Implementación del método abstracto
    @Override
    public String procedencia() {
        return "";
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numeroEdicion=" + numeroEdicion +
                ", mes='" + mes + '\'' +
                '}';
    }
}