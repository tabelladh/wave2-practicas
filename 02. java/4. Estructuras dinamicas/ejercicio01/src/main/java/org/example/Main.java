package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> listaPrendas = new ArrayList<String>();
        listaPrendas.add("Nike Air Force");
        listaPrendas.add("Topper Circus");
        listaPrendas.add("Adidas LWST");
        listaPrendas.add("Adidas Campus");

        HashMap<Integer,String> mapaGuardaRopas = new HashMap<>();

        for (int i=0; i< listaPrendas.size(); i++){
            mapaGuardaRopas.put(i,listaPrendas.get(i));
        }

        for (Map.Entry<Integer,String> entrada : mapaGuardaRopas.entrySet()) {
            Integer clave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println ("La clave es: " + clave + ". El valor es: " + valor);
        }

        //Ahora que pasaria si necesitamos un numero o una clave y que pueda retirar mas de una prenda

        HashMap<Integer, List<String>> mapaGuardaRopas2 = new HashMap<>();
        mapaGuardaRopas2.put(0,listaPrendas);

        List<String> listaPrendas2 = new ArrayList<String>();
        listaPrendas.add("Nike Air Force 2");
        listaPrendas.add("Topper Circus 2");
        listaPrendas.add("Adidas LWST 2");
        listaPrendas.add("Adidas Campus 2" );
        mapaGuardaRopas2.put(1,listaPrendas2);

        for (Map.Entry<Integer,String> entrada : mapaGuardaRopas.entrySet()) {
            Integer clave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println ("La clave es: " + clave + ". El valor es: " + valor);
        }

        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese su numero: ");
        int num = sc.nextInt();

        for (Map.Entry<Integer,List<String>> entrada : mapaGuardaRopas2.entrySet()) {
            if(entrada.getKey()==num){
                List<String> valor = entrada.getValue();
                System.out.println("Se encuentran las prendas: " + valor);
            }
        }













    }
}