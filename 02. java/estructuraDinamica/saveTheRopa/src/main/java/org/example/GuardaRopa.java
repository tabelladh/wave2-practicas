package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    private int contador = 0;
    private Map<Integer, List<Prenda>> diccionario = new HashMap<>();

    public Integer guardarPrendas(List<Prenda> listaDePrenda) {
        contador++;
        diccionario.put(contador, listaDePrenda);
        return contador;
    }

    public void mostrarPrendas() {
        System.out.println("Prendas en el guardarropa:");
        for (Map.Entry<Integer, List<Prenda>> entry : diccionario.entrySet()) {
            System.out.println("Número: " + entry.getKey());
            List<Prenda> prendas = entry.getValue();
            for (Prenda prenda : prendas) {
                System.out.println("Marca: " + prenda.marca + ", Modelo: " + prenda.modelo);
            }
        }
    }

    public List<Prenda> devolverPrendas(Integer numero) {
        return diccionario.getOrDefault(numero, new ArrayList<>());
    }
}