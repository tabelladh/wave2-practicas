package org.example;

class Libro extends ArticuloBiblioteca implements Prestable {
    private String autor;
    private boolean prestado;

    public Libro(String codigo, String nombre, int añoPublicacion, String autor) {
        super(codigo, nombre, añoPublicacion);
        this.autor = autor;
        this.prestado = false;
    }

    @Override
    public void prestar() {
        this.prestado = true;
        System.out.println("Libro " + nombre + " prestado correctamente.");
    }

    @Override
    public void devolver() {
        this.prestado = false;
        System.out.println("Libro " + nombre + " devuelto correctamente.");
    }

    @Override
    public void mostrarAtributos() {
        System.out.println("Libro: " + nombre + ", Autor: " + autor + ", Año de Publicación: " + añoPublicacion);
    }
}
