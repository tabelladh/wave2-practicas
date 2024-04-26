package org.example;

class Ejecutivo extends Cliente implements IDeposito, ITransferencia {
    @Override
    public void depositar() {
        System.out.println("Se está realizando el deposito, aguarde por favor...");
        transaccionOk();

    }

    @Override
    public void transferir() {
        System.out.println("Se está realizando la transferencia, aguarde por favor...");
        transaccionNoOk();

    }
}
