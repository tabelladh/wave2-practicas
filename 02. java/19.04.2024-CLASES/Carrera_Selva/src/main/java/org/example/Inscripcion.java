package org.example;

public class Inscripcion {

    /*  Cada inscripción debe contar con un número de inscripción,
    una categoría, un participante y el monto a abonar por el participante.
    */

    private Integer nroInscripcion;
    private Categoria categoria;
    private Participante participante;
    private Float montoAbonar;

    public Inscripcion(Integer nroInscripcion, Categoria categoria, Participante participante) {
        this.nroInscripcion = nroInscripcion;
        this.categoria = categoria;
        this.participante = participante;
        this.montoAbonar = this.calculaMontoAbonar(categoria, participante.getEdad());
    }

    public Integer getNroInscripcion() {
        return nroInscripcion;
    }

    public void setNroInscripcion(Integer nroInscripcion) {
        this.nroInscripcion = nroInscripcion;
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

    public Float getMontoAbonar() {
        return montoAbonar;
    }

    public void setMontoAbonar(Float montoAbonar) {
        this.montoAbonar = montoAbonar;
    }

    public Float calculaMontoAbonar(Categoria categoria, Integer edad)
    { Float monto = null;
        if (edad < 18 &&  categoria.getCostoInscripcionMenor()>0) { monto = categoria.getCostoInscripcionMenor();  }
        else { monto = categoria.getCostoInscripcionMayor(); }
     return monto;
    };

    //public String toString()    {    }

    }


