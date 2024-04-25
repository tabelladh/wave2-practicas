package org.example;

public class Curriculum extends Documento {
    private String nombrePersona;
    private String DNI;
    private String tituloUniversitario;
    private int añosDeExperiencia;

    public Curriculum(String id_documento, String nombrePersona, String DNI, String tituloUniversitario, int añosDeExperiencia) {
        super(id_documento);
        this.nombrePersona = nombrePersona;
        this.DNI = DNI;
        this.tituloUniversitario = tituloUniversitario;
        this.añosDeExperiencia = añosDeExperiencia;
    }

    @Override
    public void imprimir() {
        System.out.println("Nombre: " + nombrePersona + ", DNI: " + DNI + ", Titulo Universitario: " + tituloUniversitario + ", Años de Experiencia: " + añosDeExperiencia);
    }
}

