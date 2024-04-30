package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    class CarreraDeLaSelva {
        private List<Categoria> categorias;
        private List<Inscripcion> inscripciones;
        private int inscripcionCounter = 1;
        private List<Inscripcion> obtener;

        public CarreraDeLaSelva() {
            this.categorias = new ArrayList<>();
            this.inscripciones = new ArrayList<>();
        }

        public void agregarCategoria(Categoria categoria) {
            categorias.add(categoria);
        }

        public void inscribirParticipante(Categoria categoria, Participante participante) {
            Inscripcion inscripcion = new Inscripcion(inscripcionCounter++, categoria, participante);
            inscripciones.add(inscripcion);
        }

        public List<Inscripcion> obtenerInscripcionesPorCategoria(int idCategoria) {
            List<Inscripcion> resultado = new ArrayList<>();
            for (Inscripcion inscripcion : inscripciones) {
                if (inscripcion.getCategoria().getId() == idCategoria) {
                    resultado.add(inscripcion);
                }
            }
            return resultado;
        }

        public void desinscribirParticipante(int numeroInscripcion) {
            inscripciones.removeIf(inscripcion -> inscripcion.getNumeroInscripcion() == numeroInscripcion);
        }

        public double calcularMontoTotalPorCategoria(int idCategoria) {
            double total = 0;
            for (Inscripcion inscripcion : inscripciones) {
                if (inscripcion.getCategoria().getId() == idCategoria) {
                    total += inscripcion.getMonto();
                }
            }
            return total;
        }

        public double calcularMontoTotalGeneral() {
            double total = 0;
            for (Inscripcion inscripcion : inscripciones) {
                total += inscripcion.getMonto();
            }
            return total;
        }

        public void inscribirParticipantesAlAzar() {
            Random random = new Random();
            // Crear participantes al azar y asignarlos a categorías
            for (int i = 0; i < 10; i++) {
                Participante p = new Participante(
                        random.nextInt(10000), // Número de participante aleatorio
                        "DNI" + random.nextInt(10000), // DNI aleatorio
                        "Participante" + (i + 1),
                        "Apellido" + (i + 1),
                        random.nextInt(30) + 10, // Edad entre 10 y 40
                        "123-456",
                        "911-911",
                        "O+");

                Categoria categoria = categorias.get(random.nextInt(categorias.size()));
                inscribirParticipante(categoria, p);


            }
        }
    }

