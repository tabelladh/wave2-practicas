package org.example;

public class Basico implements ICliente{

    public void consultaDeSaldo() {
        System.out.println("Usted esta consultando su saldo: ");
    }
    public void pagoDeServicio() {
        System.out.println("Usted esta queriendo pagar el un servicio: ");
    }
    public void retiroDeEfectivo() {
        System.out.println("Usted esta queriendo retirar efectivo: ");
    }

    public Basico() {
    }

    @Override
    public void transaccionOk() {

    }

    @Override
    public void transaccionNoOk() {

    }
}
