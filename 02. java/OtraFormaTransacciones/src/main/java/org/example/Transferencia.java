package org.example;

public class Transferencia implements ITransaccion {
    @Override
    public Boolean transaccionOk() {
        System.out.println("Transacción exitosa para Transferencia");
        return true;
    }

    @Override
    public Boolean transaccionNoOk() {
        System.out.println("No se puede realizar Transferencia");
        return false;
    }
}
