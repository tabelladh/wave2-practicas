package org.example;

import java.util.ArrayList;
import java.util.List;

public class Deposito {

    private List<Vehiculo>listaVehiculos = new ArrayList<>();

    public List<Vehiculo>listarVehiculos (Vehiculo vehiculo){

        listaVehiculos.add(vehiculo);

        return listaVehiculos;
    }

    public String topTres() {

        try {

            Vehiculo vehiculo1 = listaVehiculos.get(0);
            Vehiculo vehiculo2 = listaVehiculos.get(0);
            Vehiculo vehiculo3 = listaVehiculos.get(0);

            for (Vehiculo v : listaVehiculos) {
                if (v.getPrecio() > vehiculo1.getPrecio() && v.getPrecio() > vehiculo2.getPrecio() &&
                        v.getPrecio() > vehiculo3.getPrecio()) {
                    vehiculo1 = v;
                } else if (v.getPrecio() < vehiculo1.getPrecio() && v.getPrecio() > vehiculo2.getPrecio() &&
                        v.getPrecio() > vehiculo3.getPrecio()) {
                    vehiculo2 = v;
                } else if (v.getPrecio() < vehiculo1.getPrecio() && v.getPrecio() < vehiculo2.getPrecio() &&
                        v.getPrecio() > vehiculo3.getPrecio()) {
                    vehiculo3 = v;
                }
            }
            return ("los coches mas caros son:" +
                    "\n" + vehiculo1.getMarca() + " " + vehiculo1.getModelo() + " " + vehiculo1.getPrecio() +
                    "\n" + vehiculo2.getMarca() + " " + vehiculo2.getModelo() + " " + vehiculo2.getPrecio() +
                    "\n" + vehiculo3.getMarca() + " " + vehiculo3.getModelo() + " " + vehiculo3.getPrecio());

        }catch (IndexOutOfBoundsException e){
            return "la lista esta vacia";
        }

    }
}
