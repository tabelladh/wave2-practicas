package org.example;

class Basic extends Cliente implements IConsultaSaldo, IPagoServicio, IRetiroEfectivo {
    @Override
    public void consultarSaldo() {
        System.out.println("Consultando saldo, aguarde por favor..");
        transaccionOk();

    }

    @Override
    public void pagarServicio() {
        System.out.println("Pagando servicio, aguarde por favor...");
        transaccionNoOk();

    }

    @Override
    public void retirarEfectivo() {
        System.out.println("Retirando efectivo, aguarde por favor...");
        transaccionOk();

    }

    @Override
    public void transaccionOk() {
        System.out.println("Transacción exitosa");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("No se pudo concretar el pago, intente más tarde");
    }
}
