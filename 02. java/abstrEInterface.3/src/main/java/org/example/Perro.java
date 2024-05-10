package org.example;

public class Perro extends Animal implements Alimentacion{
    private String name;
    private String sonido;

    public Perro(String name) {
        super(name);
        this.name = name;
        this.sonido = "guau";
    }

    @Override
    public String emitirSonido() {
        return this.sonido;
    }

    @Override
    public String comerCarne(){
        return " Perro come carne";
    }
}
