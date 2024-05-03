package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListaCliente {

    private List<Cliente>listaCliente;

    public ListaCliente() {
    }

    public ListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public List<Cliente> agregar(Cliente... cliente){
        return listaCliente = new ArrayList<>(List.of(cliente));
    }

    public void mostrar(){
        listaCliente.stream()
                .forEach(System.out::println);
    }

    public void buscar(int dni){
        try {
            listaCliente.stream()
                    .filter(c-> c.getDni()==dni)
                    .findFirst()
                    .orElseThrow(()-> new RuntimeException("no se encontro la persona con dni: " + dni));
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
