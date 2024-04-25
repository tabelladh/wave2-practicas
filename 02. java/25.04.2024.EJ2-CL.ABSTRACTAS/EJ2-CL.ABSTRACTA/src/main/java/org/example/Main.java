package org.example;

public class Main {
    public static void main(String[] args) {

        Informe informe = new Informe( "I1", "Contenido del Informe", 20, "Franco Lazzaroni", "J. Tavella" );
        LibroPDF libroPDF = new LibroPDF( "L1", 300, "La Doctrina Secreta - Antropogenesis ", "Helena Blavatsky", "Esoterismo"        );
        Curriculum curriculum = new Curriculum("C1", "Franco M. Lazzaroni", "31832064", "Ing. Sistemas", 15);

        informe.imprimir();
        libroPDF.imprimir();
        curriculum.imprimir();



    }
}