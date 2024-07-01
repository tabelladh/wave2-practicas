package com.example.Joyeria.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Jewel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String material;
    private double peso;
    private String particularidad;
    private boolean poseePiedra;
    private boolean venta;

    @OneToOne
    @JoinColumn(name = "certificate_id")
    private Certificate certificate;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @ManyToMany(mappedBy = "jewel")
    private List<JewelBill> jewelBill;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getParticularidad() {
        return particularidad;
    }

    public void setParticularidad(String particularidad) {
        this.particularidad = particularidad;
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
