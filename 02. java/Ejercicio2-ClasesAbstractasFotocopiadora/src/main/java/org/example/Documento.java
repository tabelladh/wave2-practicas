package org.example;

abstract class Documento {

    protected int idDocumento;

    public Documento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public abstract String imprimir();
}