package org.example.clasesEInterfaces.fotocopiadora;

class Curriculum extends Documento {
    private String nombrePersona;
    private String DNI;
    private String tituloUniversitario;
    private int añosExperiencia;

    public Curriculum() {
    }

    public Curriculum(String id_documento, String nombrePersona, String DNI, String tituloUniversitario, int añosExperiencia) {
        super(id_documento);
        this.nombrePersona = nombrePersona;
        this.DNI = DNI;
        this.tituloUniversitario = tituloUniversitario;
        this.añosExperiencia = añosExperiencia;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTituloUniversitario() {
        return tituloUniversitario;
    }

    public void setTituloUniversitario(String tituloUniversitario) {
        this.tituloUniversitario = tituloUniversitario;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public void imprimir() {
        System.out.println("Nombre: " + nombrePersona);
        System.out.println("DNI: " + DNI);
        System.out.println("Título Universitario: " + tituloUniversitario);
        System.out.println("Años de Experiencia: " + añosExperiencia);
    }
}