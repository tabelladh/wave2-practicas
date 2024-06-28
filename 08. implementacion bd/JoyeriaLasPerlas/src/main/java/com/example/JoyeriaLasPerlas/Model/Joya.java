package com.example.JoyeriaLasPerlas.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "joyas")
public class Joya {


    private Double peso;

    private String particularidad;

    private Boolean poseePiedra;

    private Boolean vendido;
    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name="certificado_id")
    private Certificado certificado;

    public void setId(Integer id) {
    }
}
