package com.example.relaciones.ManyToMany;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name ="courses")
public class Course {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;


        @ManyToMany(mappedBy = "likedCourses")
        private Set<Student> likes;
}