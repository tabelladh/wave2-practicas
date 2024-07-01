package com.example.AlumnoDTORP.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name= "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(name = "nombre", length = 25)
    private String nombre;
    @Column(name = "grado", length = 20)
    private String grado;
    @Column(name = "certificado")
    private Boolean certificado;
    @Column(name = "duracion")
    private Double duracion;

//    @ManyToMany(mappedBy = "cursos")
//    private List<Alumno> alumnosList;

}
