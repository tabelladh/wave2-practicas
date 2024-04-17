package org.example;

public class ActividadDos {
    public void calcularSueldo(int sueldo){

        if(sueldo <= 20000 ){
            System.out.println("te corresponde un aumento del 20%, tusueldo actual es:" +String.format("$%.2f", sueldo * 1.2));
        }else {
            if(sueldo <= 45000){
                System.out.println("te corresponde un aumento del 10%, tusueldo actual es:" +String.format("$%.2f", sueldo * 1.1));
            }else{
                System.out.println("te corresponde un aumento del 5%, tusueldo actual es:" +String.format("$%.2f", sueldo * 1.05));
            }
        }
    }
}
