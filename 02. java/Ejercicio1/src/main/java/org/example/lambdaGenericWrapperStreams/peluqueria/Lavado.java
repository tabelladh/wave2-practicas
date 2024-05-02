package org.example.lambdaGenericWrapperStreams.peluqueria;

class Lavado extends ServicioGenerico<Integer> {
    String observacion;

    public Lavado(Integer id, String nombre, String observacion) {
        super(id, nombre);
        this.observacion = observacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}