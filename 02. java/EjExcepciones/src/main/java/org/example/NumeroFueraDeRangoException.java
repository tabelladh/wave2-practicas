package org.example;

public class NumeroFueraDeRangoException extends Exception {
    public NumeroFueraDeRangoException(String mensaje) {
        super(mensaje);
    }

    public NumeroFueraDeRangoException() {
    }
}
