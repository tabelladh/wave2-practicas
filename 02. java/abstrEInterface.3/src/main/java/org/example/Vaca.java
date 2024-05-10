package org.example;

public class Vaca extends Animal implements AlimentacionTipo2{
        private String name;
        private String sonido;

        public Vaca(String name) {
            super(name);
            this.name = name;
            this.sonido = "muuu";
        }

        @Override
        public String emitirSonido() {
            return this.sonido;
        }

        @Override
    public String comerHierba(){
            return "come pasto";
        }
}
