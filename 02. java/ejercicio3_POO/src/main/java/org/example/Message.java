package org.example;


class NumeroFueraDeRangoException extends Exception {
    public NumeroFueraDeRangoException(String mensaje) {
        super(mensaje);
    }
}