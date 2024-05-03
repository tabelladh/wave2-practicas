package org.example;

public class Lavado extends ServiciosGenericos<Integer>{

    private String observicion;

    public Lavado() {
    }

    public Lavado(Integer id, String nombre, String observicion) {
        super(id, nombre);
        this.observicion = observicion;
    }

    public String getObservicion() {
        return observicion;
    }

    public void setObservicion(String observicion) {
        this.observicion = observicion;
    }

    @Override
    public String toString() {
        return "Lavado{" +
                "observicion='" + observicion + '\'' +
                '}';
    }
}
