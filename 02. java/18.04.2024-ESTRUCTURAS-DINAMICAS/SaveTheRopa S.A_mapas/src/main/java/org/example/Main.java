
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Crea el gruardarropas y la estructura para las listas de prendas que tendra
        List<String[][]> prendas = new ArrayList<>();
        HashMap<Integer, List<String[][]>> guardaropa = new HashMap<>();

        //Crea una lista de ejemplo a insertar
        String[][] prendax = {
                {"DOLCE", "INVIERNO_2024"},
                {"GUCCI", "PRIMAVERA_2024"},
                {"PRADA", "OTOÑO_2024"}
        };

        prendas.add(prendax.clone());
        guardaropa.put((guardaropa.size()+1), prendas);
        //asi se obtendria, si fuera funcion, el id de la operacion de arriba.
        int operacionId = guardaropa.size();

        //Se reusan las vaiables y se registra una nueva lista de prendas para el guardaRopa
        prendax = new String[][] {                {"DOLCE", "INVIERNO_2024_22222"}        };
        prendas = new ArrayList<>();
        prendas.add(prendax.clone());
        guardaropa.put((guardaropa.size()+1), prendas);

        //Muestra todo el guardarropas
        for (Map.Entry<Integer, List<String[][]> > listaPrendas : guardaropa.entrySet()) {
            System.out.println("Para el indice: " + listaPrendas.getKey() + " y sus prendas son las que siguen: " );
            for (String[][] matriz : listaPrendas.getValue()) {
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println();
            }

        }

        //Mostrar prenda para un indice particular
        Integer indiceElegido = 2;
        System.out.println("Para el indice: " + indiceElegido + " y sus prendas son las que siguen: " );
        for (String[][] matriz : guardaropa.get(indiceElegido)) {

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
        }

    }
}
