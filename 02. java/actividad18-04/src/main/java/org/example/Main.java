package org.example;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Map<String,String>> guardaRopa = new HashMap<>();

        HashMap<String,String>clienteUno = new HashMap<>();
        clienteUno.put("remera","nike");
        guardaRopa.put(1,clienteUno);

        HashMap<String,String>clienteDos = new HashMap<>();
        clienteDos.put("pantalon","adidas");
        guardaRopa.put(2,clienteDos);


        for (Map.Entry<Integer, Map<String, String>> entry : guardaRopa.entrySet()) {
            int indice = entry.getKey();
            Map<String, String> prendasEnGuardaRopas = entry.getValue();

            System.out.println("el cliente " + indice + " le corresponde: " + prendasEnGuardaRopas);
        }

    }
}