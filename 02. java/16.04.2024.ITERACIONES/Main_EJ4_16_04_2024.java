package 16.04.2024.ITERACIONES;

import java.util.Scanner;

public class Main_EJ4_16_04_2024 {

    public static void main(String[] args) {

        public static void main(String[] args) {

            int opcion=0, suscriptosDiarioA=0, suscriptosDiarioAB=0, suscriptosDiarioAC=0, suscriptosDiarioBC=0, suscriptosDiarioABC  = 0;
            Scanner sc = new Scanner(System.in);

            for (int i =0; i<50; i++)
            {
                System.out.println("\nEl Indice de carga de cliente es : " + (i+1) );

                System.out.print("INGRESE EL NUMERO DE OPCION PARA EL CLINETE DE CARGA:\n" +
                        "OPC 1: SUSCRITO A LOS TRES DIARIOS.\n" +
                        "OPC 2: SUSCRITO A DIARIO A Y DIRARIO C.\n" +
                        "OPC 3: SUSCRITO A DIARIO A Y DIRARIO B.\n" +
                        "OPC 4: SUSCRITO A DIARIO B Y DIRARIO C.\n" +
                        "OPC 5: SUSCRITO A DIARIO A.\n");

                System.out.print("\nIndique el numero de opcion que corresponda: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1: suscriptosDiarioABC++;
                        break;
                    case 2: suscriptosDiarioAC++;
                        break;
                    case 3: suscriptosDiarioAB++;
                        break;
                    case 4: suscriptosDiarioBC++;
                        break;
                    case 5: suscriptosDiarioA++;
                        break;
                    default: System.out.println("Se ha seleccionado una opcion no valida, no sera consideada para el calculo final");
                        break;
                }
            }

            sc.close();

            System.out.println("CONTEO DE CASOS:");
            System.out.println("CANTIDAD DE SUSCRIPTOS A LOS 3 DIARIOS : " + suscriptosDiarioABC);
            System.out.println("CANTIDAD DE SUSCRIPTOS A LOS DIARIOS A y C : " + suscriptosDiarioAC);
            System.out.println("CANTIDAD DE SUSCRIPTOS A LOS DIARIOS A y B : " + suscriptosDiarioAB);
            System.out.println("CANTIDAD DE SUSCRIPTOS A LOS DIARIOS B y C : " + suscriptosDiarioBC);
            System.out.println("CANTIDAD DE SUSCRIPTOS AL DIARIO A UNICAMENTE : " + suscriptosDiarioA);

        }
    }


}
