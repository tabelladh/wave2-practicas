package org.example;

public class Lavado extends ServicioGenerico<Integer>{

    private String observacion;

    public Lavado() {
    }

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

    @Override
    public String toString() {
        return "Lavado{ " + "id = " + getId() + ", nombre = " + getNombre() +
                ", observacion='" + observacion + '\'' +
                '}';
    }
}
