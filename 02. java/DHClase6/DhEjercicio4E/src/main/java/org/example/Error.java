package org.example;

class NumeroFueraDeRangoException extends Exception {

    public NumeroFueraDeRangoException() {
    }
    public NumeroFueraDeRangoException(String message) {
        super(message);
    }
}