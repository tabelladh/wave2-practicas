package com.example.joyeria.entity;


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
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //nombre
    private String nombre;
    //material (oro, plata, etc)
    private String material;
    //peso (en gramos)
    private Double peso;
    //particularidad,
    private String particularidad;
    //posee_piedra,
    @Column(name = "posee_piedra")
    private Boolean poseePiedra;
    //ventaONO;
    @Column(name = "venta_o_no")
    private Boolean ventaONo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "certificado_id", referencedColumnName = "id")
    private Certificado certificado;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id", nullable = false)
    private Cliente cliente;


}
