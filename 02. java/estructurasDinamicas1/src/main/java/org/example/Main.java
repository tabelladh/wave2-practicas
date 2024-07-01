import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String[][]> prendas = new ArrayList<>();
        HashMap<Integer, List<String[][]>> guardaropa = new HashMap<>();

        String[][] prendax = {
                {"DOLCE", "INVIERNO_2024"},
                {"GUCCI", "PRIMAVERA_2024"},
                {"PRADA", "OTOÑO_2024"}
        };

        prendas.add(prendax.clone());
        guardaropa.put((guardaropa.size()+1), prendas);
        int operacionId = guardaropa.size();
        prendax = new String[][] {                {"DOLCE", "INVIERNO_2024_22222"}        };
        prendas=new ArrayList<>();
        prendas.add(prendax);
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
        Integer indiceElegido = 1;
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
