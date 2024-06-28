package com.example.demoSorteo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "sur_name")
    private String surName;
    @Column(name = "dni", unique = true)
    private String dni;
    @Column(name = "course")
    private String course;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Topic topic;

    public Student(String name, String surName, String dni, String course, Topic topic) {
    }
}
