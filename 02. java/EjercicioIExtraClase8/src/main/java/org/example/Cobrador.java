package org.example;

class Cobrador extends Cliente implements IRetiroEfectivo, IConsultaSaldo{
    @Override
    public void consultarSaldo() {
        System.out.println("Consultando saldo, aguarde por favor...");
        transaccionOk();

    }

    @Override
    public void retirarEfectivo() {
        System.out.println("Retirando efectivo, aguarde por favor...");
        transaccionNoOk();

    }

}
