package org.example;

public class Cobradores implements Operacion,Transaccion{
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
        return "transaccion exitosa";
    }

    @Override
    public String transaccionNoOk() {
        return "no se puede realizar la transaccion";
    }
}
