package org.example.lambdaGenericWrapperStreams.peluqueria;

class Corte extends ServicioGenerico<String> {
    String tipo;

    public Corte(String id, String nombre, String tipo) {
        super(id, nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
