package org.example;

public class Basico extends Cliente {

    @Override
    public void realizarTransaccion(ITransaccion transaccion) {
        if(transaccion instanceof ConsultaDeSaldo || transaccion instanceof RetiroDeEfectivo || transaccion instanceof PagoDeServicios){
            transaccion.transaccionOk();
        }else{
            transaccion.transaccionNoOk();
        }
    }
}