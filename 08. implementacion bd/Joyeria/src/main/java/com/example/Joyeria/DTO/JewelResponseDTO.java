package com.example.Joyeria.DTO;

import com.example.Joyeria.Model.Jewel;

public class JewelResponseDTO {
    private Long id;
    private String material;
    private String nombre;
    private String particularidad;
    private double peso;
    private boolean poseePiedra;
    private boolean venta;

    // Constructor vacío (necesario para frameworks como Spring que utilizan reflection)
    public JewelResponseDTO() {
    }

    public JewelResponseDTO(Jewel jewel) {
        this.id = jewel.getId();
        this.material = jewel.getMaterial();
        this.nombre = jewel.getNombre();
        this.particularidad = jewel.getParticularidad();
        this.peso = jewel.getPeso();
        this.poseePiedra = jewel.isPoseePiedra();
        this.venta = jewel.isVenta();
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParticularidad() {
        return particularidad;
    }

    public void setParticularidad(String particularidad) {
        this.particularidad = particularidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isPoseePiedra() {
        return poseePiedra;
    }

    public void setPoseePiedra(boolean poseePiedra) {
        this.poseePiedra = poseePiedra;
    }

    public boolean isVenta() {
        return venta;
    }

    public void setVenta(boolean venta) {
        this.venta = venta;
    }
}

