package org.example;

public class Curriculum extends Fotocopiadora{
    String nombre;
    int dni;
    String titulo;
    int añosExperiencia;

    public Curriculum(int idDocumento, String nombre, int dni, String titulo, int añosExperiencia) {
        super(idDocumento);
        this.nombre = nombre;
        this.dni = dni;
        this.titulo = titulo;
        this.añosExperiencia = añosExperiencia;
    }
    public Curriculum() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    @Override
    public void imprimir() {
        return ("Curriculum de: \nNombre: " + nombre +
                "\nDNI: " + dni + "\nTitulo: " + titulo +
                "\nAños de experiencia: " + añosExperiencia);

    }
}
