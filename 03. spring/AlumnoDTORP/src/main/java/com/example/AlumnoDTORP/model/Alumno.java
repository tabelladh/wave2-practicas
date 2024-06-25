package com.example.AlumnoDTORP.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 25, nullable = false)
    private String nombre;
    @Column(name = "apellidos", length = 25, nullable = false)
    private String apellidos;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "yyyy-MM-dd")
    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;
    @Column(name = "dni", nullable = false)
    private Integer dni;
    @Column(name = "direccion")
    private String direccion;

//    @ManyToOne
//    @JoinColumn(name = "curso_id")
//    private List<Curso> cursosList;

}
