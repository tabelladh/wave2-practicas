package com.example.Joyeria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "certificados")
public class Certificado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name= "num_certificado")
    Integer numCertificado;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "joya_id")
    private Joya joya;

}
