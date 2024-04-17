package org.example;

import java.util.Scanner;

public class ActividadCuatro {
    public void obtenerEncuesta(int encuestados){
        Scanner scanner = new Scanner(System.in);
        int contadorDiarioA = 0;
        int contadorDiarioB = 0;
        int contadorDiarioC = 0;
        int diarioABC = 0;
        int diarioAB = 0;
        int diarioAC = 0;
        int diarioBC = 0;
        int diarioA = 0;
        int i = 0;
        while (i < encuestados){
            System.out.println("***********BIENVENIDO*************");
            System.out.println("lees el diarioA?/preciona 1 por afirmativo");
            int diario = scanner.nextInt();
            if(diario== 1){contadorDiarioA++;}

            System.out.println("lees el diarioB?/preciona 1 por afirmativo");
            int diarioB = scanner.nextInt();
            if(diarioB == 1){contadorDiarioB++;}

            System.out.println("lees el diarioC?/preciona 1 por afirmativo");
            int diarioC = scanner.nextInt();
            if(diarioC == 1){contadorDiarioC++;}
            System.out.println("***********MUCHAS GRACIAS*************");

            if(contadorDiarioA == 1 && contadorDiarioB ==1 && contadorDiarioC ==1 ){
                diarioABC++;
            }else {
                if(contadorDiarioA == 1 && contadorDiarioB ==1 && contadorDiarioC ==0 ){
                    diarioAB++;
                } else if(contadorDiarioA == 1 && contadorDiarioB ==0 && contadorDiarioC ==1 ) {
                    diarioAC++;
                }else if(contadorDiarioA == 0 && contadorDiarioB ==1 && contadorDiarioC ==1 ){
                    diarioBC++;
                }else if(contadorDiarioA == 1 && contadorDiarioB ==0 && contadorDiarioC ==0 ){
                    diarioA++;
                }
            }
             contadorDiarioA = 0;
             contadorDiarioB = 0;
             contadorDiarioC = 0;
             i++;
        }
        System.out.println("están suscriptos a los 3 diarios: " + diarioABC + " personas");
        System.out.println("están suscriptos al Diario A y al Diario C: " + diarioAC+ " personas");
        System.out.println(" están suscriptos al Diario A y al Diario B: " + diarioAB+ " personas");
        System.out.println("están suscriptos al Diario B y al Diario C: " + diarioBC+ " personas");
        System.out.println(" están suscriptos solo al Diario A: " + diarioA+ " personas");
    }
}
