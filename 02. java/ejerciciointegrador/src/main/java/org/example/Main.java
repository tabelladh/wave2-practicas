package org.example;

public class Main {
    public static void main(String[] args) {

        ListaCliente listaCliente = new ListaCliente();

        Cliente cliente1 = new Cliente(35,"matias","oggero");
        Cliente cliente2 = new Cliente(38,"priscila","pratta");
        Cliente cliente3 = new Cliente(70,"vitto","oggero");

        listaCliente.agregar(cliente1,cliente2,cliente3);
        listaCliente.mostrar();
        listaCliente.buscar(70);

    }
}