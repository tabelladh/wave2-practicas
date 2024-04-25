package org.example;

public class Deposito implements Transaccion {

    public void transaccionOk() {
        System.out.println("Depósito realizado correctamente");
    }
    public void transaccionNoOk() {
        System.out.println("Depósito no realizado");
    }
}

