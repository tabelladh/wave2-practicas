package org.example;

public class Curriculums extends Documento {

    String nombrePersona;
    int Dni;
    String tituloUniversitario;
    int aniosExperiencia;

    public Curriculums(int idDocumento, String nombrePersona, int dni, String tituloUniversitario, int aniosExperiencia) {
        super(idDocumento);
        this.nombrePersona = nombrePersona;
        Dni = dni;
        this.tituloUniversitario = tituloUniversitario;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int dni) {
        Dni = dni;
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
    public String imprimir () {
        return "Curriculums " +
                "nombrePersona='" + nombrePersona + '\'' +
                ", Dni=" + Dni +
                ", tituloUniversitario='" + tituloUniversitario + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                ", idDocumento=" + idDocumento;
    }
}
