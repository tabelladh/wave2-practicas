package org.example;

public class Deposito implements ITransaccion {

    @Override
    public Boolean transaccionOk() {
        System.out.println("Transacción exitosa para Deposito");
        return true;
    }

    @Override
    public Boolean transaccionNoOk() {
        System.out.println("No se puede realizar Deposito");
        return false;
    }
}
