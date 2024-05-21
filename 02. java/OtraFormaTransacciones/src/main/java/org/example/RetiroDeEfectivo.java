package org.example;

public class RetiroDeEfectivo implements ITransaccion {
    @Override
    public Boolean transaccionOk() {
        System.out.println("Transacción exitosa para Retiro de Efectivo");
        return true;
    }

    @Override
    public Boolean transaccionNoOk() {
        System.out.println("No se puede realizar Retiro de Efectivo");
        return false;
    }
}
