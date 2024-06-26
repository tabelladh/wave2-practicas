package com.example.joyeria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "certificado")
public class Certificado {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "idcertificado")
   private Integer idCertificado;

   @OneToOne
   @JoinColumn(name = "joyas_idjoyas")
   private Joya joya;
}