package org.example;
// EJEMPLO DE USO CON INSTANCEOF , COMPARADOR DE TIPOS DE CLIENTES
public class Main {
    public static void main(String[] args) {
        /**Tipos de Clientes**/
        Ejecutivo ejecutivo = new Ejecutivo();
        Basico basico = new Basico();
        Cobrador cobrador = new Cobrador();

        /** OPERACIONES **/
        ConsultaDeSaldo consultaDeSaldo = new ConsultaDeSaldo();
        Deposito deposito = new Deposito();
        PagoDeServicios pagoDeServicios = new PagoDeServicios();
        RetiroDeEfectivo retiroDeEfectivo = new RetiroDeEfectivo();
        Transferencia   transferencia = new Transferencia();
        /***/

        //Un ejecutivo no puede realizar consulta de saldo, pero si deposito
        ejecutivo.realizarTransaccion(consultaDeSaldo);
        ejecutivo.realizarTransaccion(deposito);

        basico.realizarTransaccion(consultaDeSaldo);
    }


}