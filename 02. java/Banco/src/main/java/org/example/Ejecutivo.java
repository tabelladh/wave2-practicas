package org.example;

public class Ejecutivo implements IOperacion, ITransaccion {

    @Override
    public String Deposito() {
        return transaccionOk();
    }

    @Override
    public String Transferencia() {
        return transaccionOk();
    }

    @Override
    public String RetiroDeEfectivo() {
        return transaccionNoOk();
    }

    @Override
    public String ConsultaDeSaldo() {
        return transaccionNoOk();
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
