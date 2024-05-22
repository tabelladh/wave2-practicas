package org.example.clasesEInterfaces.biblioteca;

class Mapa extends ArticuloBiblioteca implements NoPrestable {
    private String tipoMapa;
    private String tamanio;

    public Mapa() {
    }

    public Mapa(String codigo, String nombre, int añoPublicacion, String tipoMapa, String tamanio) {
        super(codigo, nombre, añoPublicacion);
        this.tipoMapa = tipoMapa;
        this.tamanio = tamanio;
    }

    public String getTipoMapa() {
        return tipoMapa;
    }

    public void setTipoMapa(String tipoMapa) {
        this.tipoMapa = tipoMapa;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String utilizarEnBiblioteca() {
        return ("Mapa " + getNombre() + " utilizado en la biblioteca.");
    }

    @Override
    public String devolverEnBiblioteca() {
        return ("Mapa " + getNombre() + " devuelto en la biblioteca.");
    }

    // Implementación del método abstracto
    @Override
    public String procedencia() {
        return "";
    }

    @Override
    public String toString() {
        return "Mapa{" +
                "tipoMapa='" + tipoMapa + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }
}
