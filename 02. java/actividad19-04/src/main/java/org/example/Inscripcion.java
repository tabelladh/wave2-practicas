package org.example;

public class Inscripcion {

    private int numInscripcion;
    private Categoria categoria;
    private Persona persona;
    private int monto;

    public Inscripcion() {
    }

    public Inscripcion(int numInscripcion, Categoria categoria, Persona persona) {
        this.numInscripcion = numInscripcion;
        this.categoria = categoria;
        this.persona = persona;
        this.monto = calcularMonto();
    }

    public int getNumInscripcion() {
        return numInscripcion;
    }

    public void setNumInscripcion(int numInscripcion) {
        this.numInscripcion = numInscripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int calcularMonto(){

        if (categoria.getNombre().equals("Circuito chico")) {
            monto = (persona.getEdad() < 18) ? 1300 : 1500;
        } else if (categoria.getNombre().equals("Circuito medio")) {
            monto = (persona.getEdad() < 18) ? 2000 : 2300;
        } else if (categoria.getNombre().equals("Circuito avanzado")) {
            monto = 2800;
        }
        return monto;
    }

    @Override
    public String toString() {
        return "Inscripcion: " + numInscripcion +
                ",\n categoria: " + categoria.getNombre() +
                ",\n persona: " + persona.getNombre() +
                ",\n monto de la inscripcion: " + monto +
                "\n**************************";
    }
}
