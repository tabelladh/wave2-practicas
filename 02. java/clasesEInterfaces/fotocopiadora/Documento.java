package org.example.clasesEInterfaces.fotocopiadora;

abstract class Documento implements Imprimible {
    protected String id_documento;

    public Documento() {
    }

    public Documento(String id_documento) {
        this.id_documento = id_documento;
    }

    public String getId_documento() {
        return id_documento;
    }

    public void setId_documento(String id_documento) {
        this.id_documento = id_documento;
    }

    @Override
    public abstract void imprimir();
}