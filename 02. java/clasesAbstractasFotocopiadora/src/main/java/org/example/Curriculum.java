package org.example;

public class Curriculum extends Documento {
    private String nombrePersona;
    private int dni;
    private String tituloUniversitario;
    private int aniosExperiencia;


    public Curriculum() {
    }

    public Curriculum(String nombrePersona, int dni, String tituloUniversitario, int aniosExperiencia) {
        this.nombrePersona = nombrePersona;
        this.dni = dni;
        this.tituloUniversitario = tituloUniversitario;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTituloUniversitario() {
        return tituloUniversitario;
    }

    public void setTituloUniversitario(String tituloUniversitario) {
        this.tituloUniversitario = tituloUniversitario;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    @Override
    public void imprimir() {
        System.out.println("Id: " + id_documento);
        System.out.println("Nombre: " + nombrePersona);
        System.out.println("DNI: " + dni);
        System.out.println("Titulo Universitario: " + tituloUniversitario);
        System.out.println("Años de Experiencia: " + aniosExperiencia);
    }
}

