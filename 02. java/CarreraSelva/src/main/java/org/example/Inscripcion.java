package org.example;



class Inscripcion {
    private int numeroInscripcion;
    private Categoria categoria;
    private Participante participante;
    private double monto;

    public Inscripcion(int numeroInscripcion, Categoria categoria, Participante participante) {
        this.numeroInscripcion = numeroInscripcion;
        this.categoria = categoria;
        this.participante = participante;
        this.monto = calcularMonto();
    }

    private double calcularMonto() {
        int edad = participante.getEdad();
        if (categoria.getId() == 1) {
            return edad < 18 ? 1300 : 1500;
        } else if (categoria.getId() == 2) {
            return edad < 18 ? 2000 : 2300;
        } else if (categoria.getId() == 3) {
            return edad >= 18 ? 2800 : 0;
        } else {
            return 0;
        }
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

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Inscripcion [numero=" + numeroInscripcion + ", categoria=" + categoria.getNombre() + ", participante="
                + participante.getNombre() + ", monto=" + monto + "]";
    }


}