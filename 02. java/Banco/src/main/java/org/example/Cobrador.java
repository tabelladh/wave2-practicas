package org.example;

public class Cobrador implements ITransaccion, IOperacion{
    @Override
    public String Deposito() {
        return transaccionNoOk();
    }

    @Override
    public String Transferencia() {
        return transaccionNoOk();
    }

    @Override
    public String RetiroDeEfectivo() {
        return transaccionOk();
    }

    @Override
    public String ConsultaDeSaldo() {
        return transaccionOk();
    }

    @Override
    public String PagoDeServicios() {
        return transaccionNoOk();
    }

    @Override
    public String transaccionOk() {
        return "Transaccion realizada con exito";
    }

    @Override
    public String transaccionNoOk() {
        return "No tenes permitido realizar esta transaccion";
    }
}
