package com.example.demoSorteo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "topics")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "topic_name", unique = true)
    private String topicName;
    @Column(name = "complexity")
    private String complexity;

    //Realmente quiero bidireccionalidad? Topic necesita conocer al student?
    //@OneToOne(mappedBy = "topic")
    //private Student student;


    public Topic(Long id) {
        this.id = id;
    }

}
