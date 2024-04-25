package org.example;

public class ConsultaSaldo implements Transaccion {

    public void transaccionOk() {
        System.out.println("Saldo consultado correctamente");
    }
    public void transaccionNoOk() {
        System.out.println("No se pudo consultar el saldo");
    }
}

