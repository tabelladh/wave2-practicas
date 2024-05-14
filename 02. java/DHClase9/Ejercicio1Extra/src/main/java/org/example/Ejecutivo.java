package org.example;

class Ejecutivo implements ITransacciones {
    @Override
    public void transaccionOk() {
        System.out.println("Transacción ejecutada correctamente");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("Error en la transacción");
    }

    public void realizarDeposito() {
        System.out.println("Depósito realizado correctamente");
    }

    public void realizarTransferencia() {
        System.out.println("Transferencia realizada correctamente");
    }
}
