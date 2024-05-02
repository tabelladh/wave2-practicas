package org.example.dinamicas.carrera;

public class Inscripcion {
    private Participante participante;
    private double monto;

    public Inscripcion(Participante participante, double monto) {
        this.participante = participante;
        this.monto = monto;
    }

    public Participante getParticipante() {
        return this.participante;
    }

    public double getMonto() {
        return this.monto;
    }
}
