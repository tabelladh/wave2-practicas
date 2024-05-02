package org.example.lambdaGenericWrapperStreams.peluqueria;

public class ServicioGenerico <E> {
    E id;
    String nombre;

    public ServicioGenerico(E id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public E getId() {
        return id;
    }

    public void setId(E id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

