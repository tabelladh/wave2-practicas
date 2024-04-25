package org.example;

public abstract class Documento {
    private String id_documento;

    public Documento(String id_documento) {
        this.id_documento = id_documento;
    }

    public abstract void imprimir();
}

