package com.obtenerdiploma.entity;

import com.obtenerdiploma.dto.SubjectDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Long id;

    private String studentName;

    private String email;

    private String url;

    private Set<Subject> subjects;
}
