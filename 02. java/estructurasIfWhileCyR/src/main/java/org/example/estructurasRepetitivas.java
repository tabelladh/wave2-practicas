package org.example;

public class estructurasRepetitivas {

    int a;
    int b;

    public void doWhileLoop(int a) {
        do {
            System.out.println("a es mayor que 0");
            System.out.println("===> Esta es mi ejecución nº: " + a);
            a--;
        } while (a > 0); // Como la condición esta al final del bucle, se ejecuta al menos una vez
    }

    public void whileLoop(int a) {
        while (a > 0) {
            System.out.println("a es mayor que 0");
            System.out.println("===> Esta es mi ejecución nº: " + a);
            a--;
        }
    }

    public void forLoop(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("a es mayor que 0");
            System.out.println("===> Esta es mi ejecución nº: " + i
            );
        }
    }



}
