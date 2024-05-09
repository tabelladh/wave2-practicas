package org.example;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
    }
    public NotFoundException(String message) {
        super(message); // Llamada al constructor de la clase padre
    }

}
