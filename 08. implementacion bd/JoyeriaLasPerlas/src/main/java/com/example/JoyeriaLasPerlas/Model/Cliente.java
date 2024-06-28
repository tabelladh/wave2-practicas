package com.example.JoyeriaLasPerlas.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String nombre;

    private String apellido;

    private String email;
    @OneToMany(mappedBy = "joya")
    private List<Joya> joyaList;

    @ManyToMany(mappedBy="factura")
    private List<Factura> facturaList;

}
