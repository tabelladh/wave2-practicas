package org.example;

public class ConsultaDeSaldo implements ITransaccion {

    @Override
    public Boolean transaccionOk() {
        System.out.println("Transacción exitosa para Consulta de Saldo");
        return true;
    }

    @Override
    public Boolean transaccionNoOk() {
        System.out.println("No se puede realizar Consulta de Saldo");
        return false;
    }
}
