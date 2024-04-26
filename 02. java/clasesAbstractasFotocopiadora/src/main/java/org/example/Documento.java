package org.example;

abstract class Documento {
    protected int id_documento;
    public abstract void imprimir();

    public Documento() {
    }

    public Documento(int id_documento) {
        this.id_documento = id_documento;
    }

    public int getId_documento() {
        return id_documento;
    }

    public void setId_documento(int id_documento) {
        this.id_documento = id_documento;
    }
}


