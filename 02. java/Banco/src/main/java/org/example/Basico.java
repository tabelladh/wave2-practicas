package org.example;

public class Basico implements IOperacion, ITransaccion{
    @Override
    public String Deposito() {
        return "";
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
        return transaccionOk();
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
