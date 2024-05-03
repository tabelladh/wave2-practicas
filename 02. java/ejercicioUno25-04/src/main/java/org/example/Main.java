package org.example;

public class Main {
    public static void main(String[] args) {
        Ejecutivo e = new Ejecutivo();
        System.out.println(e.ConsultaDeSaldo());

        Basic b = new Basic();
        System.out.println(b.PagoDeServicios());
    }
}