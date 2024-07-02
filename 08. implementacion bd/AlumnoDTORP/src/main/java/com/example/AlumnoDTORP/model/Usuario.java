package com.example.AlumnoDTORP.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name= "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user", length = 25)
    private String user;
    @Column(name = "password", length = 25)
    private String password;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "alumnos_id")
    private Alumno alumno;

}
