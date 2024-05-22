package org.example;

class Inscripcion {
    int numeroInscripcion;
    Categoria categoria;
    Persona persona;
    int monto;

    public Inscripcion() {
    }

    public Inscripcion(int numeroInscripcion, Categoria categoria, Persona persona) {
        this.numeroInscripcion = numeroInscripcion;
        this.categoria = categoria;
        this.persona = persona;
        this.monto = calcularMonto();
    }

    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public void setNumeroInscripcion(int numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
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

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
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
        return "Inscripcion{" +
                "numeroInscripcion=" + numeroInscripcion +
                ", categoria=" + categoria +
                ", persona=" + persona +
                ", monto=" + monto +
                '}';
    }
}
