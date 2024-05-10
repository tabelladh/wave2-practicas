package org.example;

public class Gato extends Animal implements Alimentacion{
        private String name;
        private String sonido;

        public Gato(String name) {
            super(name);
            this.name = name;
            this.sonido = "miauuuu";
        }

        @Override
        public String emitirSonido() {
            return this.sonido;
        }

        @Override
        public String comerCarne() {
            return "Gato comiendo carne";
        }
}
