package org.example;

public class Transferencia implements Transaccion {
    public void transaccionOk() {
        System.out.println("Transferencia realizada correctamente");
    }
    public void transaccionNoOk() {
        System.out.println("Transferencia no realizada");
    }
}
