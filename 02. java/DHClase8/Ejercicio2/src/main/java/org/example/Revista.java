package org.example;

class Revista extends ArticuloBiblioteca implements NoPrestable {
    private int numeroEdicion;
    private String mes;

    public Revista(String codigo, String nombre, int añoPublicacion, int numeroEdicion, String mes) {
        super(codigo, nombre, añoPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.mes = mes;
    }

    @Override
    public void utilizarEnBiblioteca() {
        System.out.println("La revista " + nombre + " está siendo utilizada en la biblioteca.");
    }

    @Override
    public void devolverEnBiblioteca() {
        System.out.println("La revista " + nombre + " ha sido devuelta a la biblioteca.");
    }

    @Override
    public void mostrarAtributos() {
        System.out.println("Revista: " + nombre + ", Número de Edición: " + numeroEdicion + ", Mes: " + mes + ", Año de Publicación: " + añoPublicacion);
    }
}
