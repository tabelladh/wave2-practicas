package com.bootcamp.clases;

import com.bootcamp.interfaces.ConsultaSaldo;
import com.bootcamp.interfaces.PagoServicio;
import com.bootcamp.interfaces.RetiroEfec;

public class Basic implements ConsultaSaldo, PagoServicio, RetiroEfec {
    @Override
    public void consultarSaldo() {
        System.out.println("Consultando Saldo....");
 /*Acá incluso se puede poner un if....
      if salio todo ok, llama a transaccion ok, else llama a transaccion no ok (por ejemplo)
      * */    }

    @Override
    public void pagarServicio(String tipoServ) {
        System.out.println("Pagando servicio: " + tipoServ);
        /*Acá incluso se puede poner un if....
      if salio todo ok, llama a transaccion ok, else llama a transaccion no ok (por ejemplo)
      * */
    }

    @Override
    public void retirarEfectivo(Double monto) {
        System.out.println("Intentando retirar: " + monto);
        /*Acá incluso se puede poner un if....
      if salio todo ok, llama a transaccion ok, else llama a transaccion no ok (por ejemplo)
      * */
    }

    @Override
    public void transaccionOk(String tipoTransacc) {
        System.out.println( tipoTransacc +  " realizada correctamente");
    }

    @Override
    public void transaccionNoOk(String tipoTransacc) {
        System.out.println("La transacción " + tipoTransacc +  " no se pudo concluir");
    }
}
