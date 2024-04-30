package org.example;


    class Participante {
        private int numeroParticipante;
        private String dni;
        private String nombre;
        private String apellido;
        private int edad;
        private String celular;
        private String numeroEmergencia;
        private String grupoSanguineo;

        public Participante(int numeroParticipante, String dni, String nombre, String apellido, int edad, String celular,
                            String numeroEmergencia, String grupoSanguineo) {
            this.numeroParticipante = numeroParticipante;
            this.dni = dni;
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.celular = celular;
            this.numeroEmergencia = numeroEmergencia;
            this.grupoSanguineo = grupoSanguineo;
        }

        // Getters
        public int getNumeroParticipante() {
            return numeroParticipante;
        }

        public String getDni() {
            return dni;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public int getEdad() {
            return edad;
        }

        public String getCelular() {
            return celular;
        }

        public String getNumeroEmergencia() {
            return numeroEmergencia;
        }

        public String getGrupoSanguineo() {
            return grupoSanguineo;
        }

        @Override
        public String toString() {
            return "Participante [numero=" + numeroParticipante + ", dni=" + dni + ", nombre=" + nombre + ", apellido="
                    + apellido + ", edad=" + edad + ", celular=" + celular + ", emergencia=" + numeroEmergencia
                    + ", grupo sanguíneo=" + grupoSanguineo + "]";
        }
    }
