package 17.04.2024.ARRAYS;

public class Main {
    public static void main(String[] args) {

        String[] ciudades = {"Londres","Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa","Tokio" };
        int[][] mxTemp = {                {-2, 33},                {-3, 32},                {-8, 27},                {4, 37},                {6, 42},                {5, 43},                {0, 39},                {-7, 26},                {-1, 31},                {-10, 35}        };
        int[][] tmin = new int[1][2]; tmin[0][0]=0; tmin[0][1]= mxTemp[0][0];
        int[][] tmax = new int[1][2]; tmax[0][0]=0; tmin[0][1]= mxTemp[0][1];

        for (int i = 1; i<mxTemp.length; i++)
        {
            if (mxTemp[i][0] < tmin[0][0])
            {
                tmin[0][0] = i;
                tmin[0][1] = mxTemp[i][0];
            }
            if (mxTemp[i][1] > tmax[0][1])
            {
                tmax[0][0]=i;
                tmax[0][1]=mxTemp[i][1];
            }
        }

        System.out.println ("La ciudad de menor temperatura es: " + ciudades[tmin[0][0]] + " con un valor de " +  tmin[0][1] +"°" );
        System.out.println ("La ciudad de mayor temperatura es: " + ciudades[tmax[0][0]] + " con un valor de " +  tmax[0][1] +"°" );

    }
}