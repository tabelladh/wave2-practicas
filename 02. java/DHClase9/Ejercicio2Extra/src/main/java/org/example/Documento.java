package org.example;

abstract class Documento {
    protected int id_documento;

    public Documento(int id_documento) {
        this.id_documento = id_documento;
    }

    public abstract void imprimir();
}
