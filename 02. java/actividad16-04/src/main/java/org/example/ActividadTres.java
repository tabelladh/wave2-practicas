package org.example;

public class ActividadTres {
    public void getCuota(){
        for (int i = 1; i < 8; i++) {
            if(i == 2||i == 3||i == 4){
                System.out.println("el importe a abonar del cliente " + i + " es $2200");
            }else {
                System.out.println("el importe a abonar del cliente " + i + " es $1500");
            }
        }
    }
}
