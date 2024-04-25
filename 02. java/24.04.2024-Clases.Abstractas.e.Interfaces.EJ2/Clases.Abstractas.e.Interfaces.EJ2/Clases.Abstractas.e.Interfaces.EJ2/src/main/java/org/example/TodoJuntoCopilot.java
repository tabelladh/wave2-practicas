package org.example;

public class TodoJuntoCopilot {
/*
    abstract class Articulo {
        protected String codigo;
        protected String nombre;
        protected int anoPublicacion;

        public Articulo(String codigo, String nombre, int anoPublicacion) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.anoPublicacion = anoPublicacion;
        }
    }

    interface Prestable {
        void prestar();
        void devolver();
    }

    interface NoPrestable {
        void utilizarEnBiblioteca();
        void devolverEnBiblioteca();
    }

    class Libro extends Articulo implements Prestable {
        private String autor;
        private boolean prestado;

        public Libro(String codigo, String nombre, int anoPublicacion, String autor) {
            super(codigo, nombre, anoPublicacion);
            this.autor = autor;
            this.prestado = false;
        }

        @Override
        public void prestar() {
            this.prestado = true;
            System.out.println("Libro " + nombre + " correctamente prestado");
        }

        @Override
        public void devolver() {
            this.prestado = false;
            System.out.println("Libro " + nombre + " devuelto correctamente");
        }
    }

    class Revista extends Articulo implements NoPrestable {
        private int numeroEdicion;
        private String mes;

        public Revista(String codigo, String nombre, int anoPublicacion, int numeroEdicion, String mes) {
            super(codigo, nombre, anoPublicacion);
            this.numeroEdicion = numeroEdicion;
            this.mes = mes;
        }

        @Override
        public void utilizarEnBiblioteca() {
            System.out.println("Utilizando la revista " + nombre + " en la biblioteca");
        }

        @Override
        public void devolverEnBiblioteca() {
            System.out.println("Revista " + nombre + " devuelta en la biblioteca");
        }
    }

    class Mapa extends Articulo implements NoPrestable {
        private String tipoMapa;
        private String tamanio;

        public Mapa(String codigo, String nombre, int anoPublicacion, String tipoMapa, String tamanio) {
            super(codigo, nombre, anoPublicacion);
            this.tipoMapa = tipoMapa;
            this.tamanio = tamanio;
        }

        @Override
        public void utilizarEnBiblioteca() {
            System.out.println("Utilizando el mapa " + nombre + " en la biblioteca");
        }

        @Override
        public void devolverEnBiblioteca() {
            System.out.println("Mapa " + nombre + " devuelto en la biblioteca");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Libro libro = new Libro("L001", "El principito", 1943, "Antoine de Saint-Exupéry");
            libro.prestar();

            Mapa mapa = new Mapa("M001", "Mapa de Europa", 2020, "Político", "Grande");
            mapa.utilizarEnBiblioteca();

            Revista revista = new Revista("R001", "National Geographic", 2021, 12, "Diciembre");
            revista.devolverEnBiblioteca();
        }
    }


*/
}
