package org.example;

public class Cobrador extends Cliente {
    //puede realizar retiro de efectivo y consulta de saldo

    @Override
    public void realizarTransaccion(ITransaccion transaccion) {

        if(transaccion instanceof RetiroDeEfectivo || transaccion instanceof ConsultaDeSaldo){
            transaccion.transaccionOk();
        }else{
            transaccion.transaccionNoOk();
        }


    }
}
