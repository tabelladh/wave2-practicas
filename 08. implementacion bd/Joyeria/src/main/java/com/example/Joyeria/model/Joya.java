package com.example.Joyeria.model;

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
    Integer id;
    @Column (name = "nro_identificatorio")
    Integer nro_identificatorio;
    @Column (name = "nombre", nullable = false, length = 50)
    String nombre;
    @Column (name = "material")
    String material;
    @Column (name = "peso")
    Double peso;
    @Column (name = "particularidad")
    String particularidad;
    @Column (name = "posee_piedra")
    Boolean posee_piedra;
    @Column (name = "venta_ono")
    Boolean ventaONo;

    @OneToOne(mappedBy = "joya")
    private Certificado certificado;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
