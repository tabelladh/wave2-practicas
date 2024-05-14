package org.example;

class Mapa extends ArticuloBiblioteca implements NoPrestable {
    private String tipoMapa;
    private String tamaño;

    public Mapa(String codigo, String nombre, int añoPublicacion, String tipoMapa, String tamaño) {
        super(codigo, nombre, añoPublicacion);
        this.tipoMapa = tipoMapa;
        this.tamaño = tamaño;
    }

    @Override
    public void utilizarEnBiblioteca() {
        System.out.println("El mapa " + nombre + " está siendo utilizado en la biblioteca.");
    }

    @Override
    public void devolverEnBiblioteca() {
        System.out.println("El mapa " + nombre + " ha sido devuelto a la biblioteca.");
    }

    @Override
    public void mostrarAtributos() {
        System.out.println("Mapa: " + nombre + ", Tipo: " + tipoMapa + ", Tamaño: " + tamaño + ", Año de Publicación: " + añoPublicacion);
    }
}
