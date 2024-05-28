package com.obtenerdiploma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Long id;

    private String studentName;

    private Set<Subject> subjects;
}
