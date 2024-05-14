package org.example;

class Curriculum extends Documento {
    private String nombrePersona;
    private String DNI;
    private String tituloUniversitario;
    private int aniosExperiencia;

    public Curriculum(int id_documento, String nombrePersona, String DNI, String tituloUniversitario, int aniosExperiencia) {
        super(id_documento);
        this.nombrePersona = nombrePersona;
        this.DNI = DNI;
        this.tituloUniversitario = tituloUniversitario;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void imprimir() {
        System.out.println("Currículum - ID: " + id_documento);
        System.out.println("Nombre: " + nombrePersona);
        System.out.println("DNI: " + DNI);
        System.out.println("Título Universitario: " + tituloUniversitario);
        System.out.println("Años de experiencia: " + aniosExperiencia);
    }
}
