package org.example;

public abstract class Documento {
    int idDocumento;

    public Documento() {
    }

    public Documento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public abstract void imprimir();
}
