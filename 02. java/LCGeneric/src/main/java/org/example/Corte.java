package org.example;

public class Corte extends ServicioGenerico<String> {

    private String tipo;

    public Corte() {
    }

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

    @Override
    public String toString() {
        return "Corte{" + "id = " + getId() + ", nombre = " + getNombre() +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
