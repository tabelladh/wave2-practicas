package org.example.clasesEInterfaces.biblioteca;

class Libro extends ArticuloBiblioteca implements Prestable {
    private String autor;
    private boolean isPrestado;

    public Libro() {
    }

    public Libro(String codigo, String nombre, int añoPublicacion, String autor) {
        super(codigo, nombre, añoPublicacion);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return isPrestado;
    }

    public void setPrestado(boolean prestado) {
        isPrestado = prestado;
    }

    @Override
    public String prestar() {
        return ("Libro " + getNombre() + " prestado correctamente.");
    }

    @Override
    public String devolver() {
        return "(\"Libro \" + getNombre() + \" devuelto correctamente.\")";
    }

    // Implementación del método abstracto
    @Override
    public String procedencia() {
        return "";
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", isPrestado=" + isPrestado +
                '}';
    }
}

