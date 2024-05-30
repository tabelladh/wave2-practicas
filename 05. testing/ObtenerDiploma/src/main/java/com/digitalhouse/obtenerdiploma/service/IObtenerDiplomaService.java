package com.digitalhouse.obtenerdiploma.service;

import com.digitalhouse.obtenerdiploma.model.StudentDTO;

public interface IObtenerDiplomaService {

    StudentDTO analyzeScores(StudentDTO rq);
}
