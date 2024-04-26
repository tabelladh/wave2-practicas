package org.example;

public class Curriculum extends Documento {
    String nombrePersona;
    int dni;
    String tituloUniversitario;
    int aniosExperiencia;

    public Curriculum() {}

    public Curriculum(int idDocumento, String nombrePersona, int dni, String tituloUniversitario,
                      int aniosExperiencia) {
        super(idDocumento);
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

    public int getDni() {
        return dni;
    }

    public void setDni(int  dni) {
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
    public String toString() {
        return "Curriculum{" +
                "nombrePersona='" + nombrePersona + '\'' +
                ", id = '" + idDocumento + '\'' +
                ", dni='" + dni + '\'' +
                ", tituloUniversitario='" + tituloUniversitario + '\'' +
                ", aniosExperiencia='" + aniosExperiencia + '\'' +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println(this.toString());

    }
}
