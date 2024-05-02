package org.example;

public class ProfesorPractica extends Profesor implements IEducar{

    private String materialDidactico;

    public ProfesorPractica() {
    }
    public ProfesorPractica(Integer dni, String nombre, String apellido, int edad, String materialDidactico) {
        super(dni, nombre, apellido, edad);
        this.materialDidactico = materialDidactico;
    }

    public String getMaterialDidactico() {
        return materialDidactico;
    }

    public void setMaterialDidactico(String materialDidactico) {
        this.materialDidactico = materialDidactico;
    }

    @Override
    public Integer findId(Integer dni) {
        return getEdad() ;
    }


    @Override
    public String ayudarAlumno() {
        return "El profesor de practica ayuda al alumno";
    }

    @Override
    public String darClase() {
        return "El profesor de practica da clase presencial";
    }


}
