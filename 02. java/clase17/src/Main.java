


public class Main {
    public static <string> void main(String[] args) {

    //MEJORAR

        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        double[][] temperatura = {
                {-2, 33},
                {-3,32},
                {-8,27},
                {4,37},
                {6,42},
                {0,39},
                {-7,26},
                {-1,31},
                {-10,35}
        };

        for (int i = 0; i < ciudades.length; i++){
            if(ciudades == "Tokio" ){
                System.out.println("esta es la ciudad con menor temperatura:" + ciudades);
            }else if(ciudades == "SaoPablo"){
                System.out.println("esta es la ciudad con mayor temperatura:"  + ciudades);
            }
        }

        for (int i = 0; i < ciudades.length; i++){
            if(temperatura == -10 ){
                System.out.println("esta es la ciudad con menor temperatura:" + temperatura);
            }else if(temperatura == 42){
                System.out.println("esta es la ciudad con mayor temperatura:" + temperatura);
            }
        }

    }


}