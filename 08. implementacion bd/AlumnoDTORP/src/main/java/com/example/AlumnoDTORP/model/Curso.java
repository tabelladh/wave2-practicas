package com.example.AlumnoDTORP.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @Column(name = "duracion", scale = 2)
    private Double duracion;

    @ManyToOne
    @JoinColumn(name = "aulas_id")
    private Aula aula;

    @ManyToMany(mappedBy = "cursosList")
    private List<Alumno> alumnosList;

}
