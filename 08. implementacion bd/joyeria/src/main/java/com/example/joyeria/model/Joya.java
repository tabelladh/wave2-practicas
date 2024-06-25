package com.example.joyeria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "joyas")
public class Joya {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_identificatorio")
    private  Integer nroIdentificatorio;

    @Column(name = "nombre",length = 25)
    private String nombre;

    @Column(name = "material")
    private String material;

    @Column(name = "peso")
    private Double peso;

    @Column(name = "particularidad")
    private String particularidad;

    @Column(name = "pose_piedra")
    private Boolean piedra;


    @Column(name = "venta_o_no")
    private Boolean ventaOno;



}
