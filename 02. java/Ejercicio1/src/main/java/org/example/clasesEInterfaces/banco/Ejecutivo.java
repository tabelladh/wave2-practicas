package org.example.clasesEInterfaces.banco;

class Ejecutivo extends Cliente {

    public Ejecutivo() {
    }

    public void deposito() {
        System.out.println("Depositando dinero.");
    }

    public void transferencia() {
        System.out.println("Realizando transferencia.");
    }
}