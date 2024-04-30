package org.example;

public class Vaca extends Animal implements IHerbivoro{
    Double peso;
    String tipoVaca;


    public Vaca(Double peso, String tipoVaca) {
        this.peso = peso;
        this.tipoVaca = tipoVaca;
    }

    public Vaca() {
    }

    @Override
    public void emitirSonido() {
        System.out.println("La vaca hace Muuu");
    }


    public void comerHierba() {
        System.out.println("Soy una vaca y como hierba");
    }
}
