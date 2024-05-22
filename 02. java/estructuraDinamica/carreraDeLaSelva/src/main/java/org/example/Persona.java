package org.example;

public class Persona {
        int numPersona;
        int dni;
        String nombre;
        String apellido;
        int edad;
        String celular;
        String numEmergencia;
        String grupoSanguineo;

    public Persona() {
    }

    public Persona(int numPersona, int dni, String nombre, String apellido, int edad, String celular, String numEmergencia, String grupoSanguineo) {
        this.numPersona = numPersona;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.celular = celular;
        this.numEmergencia = numEmergencia;
        this.grupoSanguineo = grupoSanguineo;
    }

    public int getNumPersona() {
        return numPersona;
    }

    public void setNumPersona(int numPersona) {
        this.numPersona = numPersona;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNumEmergencia() {
        return numEmergencia;
    }

    public void setNumEmergencia(String numEmergencia) {
        this.numEmergencia = numEmergencia;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "numPersona=" + numPersona +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", celular=" + celular +
                ", numEmergencia=" + numEmergencia +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                '}';
    }
}
