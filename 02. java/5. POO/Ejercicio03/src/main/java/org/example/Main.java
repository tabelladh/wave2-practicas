package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Mascota> listaMascotas = new ArrayList<Mascota>();
        listaMascotas.add(new Mascota("Luna", "Perro", "Labrador", 3, "123456789"));
        listaMascotas.add(new Mascota("Max", "Gato", "Siames", 5, "234567890"));
        listaMascotas.add(new Mascota("Rocky", "Perro", "Bulldog", 2, "345678901"));
        listaMascotas.add(new Mascota("Nala", "Gato", "Persa", 4, "456789012"));
        listaMascotas.add(new Mascota("Buddy", "Perro", "Golden Retriever", 1, "567890123"));
        listaMascotas.add(new Mascota("Simba", "Gato", "Maine Coon", 6, "678901234"));
        listaMascotas.add(new Mascota("Coco", "Perro", "Chihuahua", 8, "789012345"));
        listaMascotas.add(new Mascota("Mia", "Gato", "Angora", 2, "890123456"));
        listaMascotas.add(new Mascota("Rocky", "Perro", "Pastor Alemán", 4, "901234567"));
        listaMascotas.add(new Mascota("Luna", "Gato", "Bengala", 3, "012345678"));


        int cantPerros = 0, cantGatos = 0, cantOtros=0 ;

        for(Mascota mascota : listaMascotas){
            if(mascota.getEspecie() == "Perro"){
                cantPerros++;
            }else{
                if(mascota.getEspecie() == "Gato"){
                    cantGatos++;
                }else{
                    cantOtros++;
                }
            }
        }
        System.out.println("Perros ganadores: " + cantPerros +
                "\n Gatos ganadores: " + cantGatos +
                "\n Otros ganadores: " + cantOtros);


    }
}