package org.example;

public class Inscripcion {
    private Participante participante;
    private double monto;

    public Inscripcion(Participante participante, double monto) {
        this.participante = participante;
        this.monto = monto;
    }

    public Inscripcion(){}

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
}
