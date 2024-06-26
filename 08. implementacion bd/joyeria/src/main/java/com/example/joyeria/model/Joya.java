package com.example.joyeria.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "joyas")
public class Joya {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String material;
    private double peso;
    private String particularidad;
    @Column(name = "posee_piedra")
    private boolean poseePiedra;
    @Column(name = "venta_o_no")
    private boolean ventaONo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cerificados_id",referencedColumnName = "id")
    private Certificado certificado;

    @ManyToOne
    @JoinColumn(name = "clientes_id")
    private Cliente cliente;

}
