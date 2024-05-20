package com.example.Certificado.dto;

public class CertificadoDTO {

    private String nombre;
    private double promedio;
    private String mensaje;

    public CertificadoDTO(String nombre, double promedio, String mensaje) {
        this.nombre = nombre;
        this.promedio = promedio;
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
