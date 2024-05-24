package com.obtenerdiploma.service;

import com.obtenerdiploma.dto.StudentWithMessageDTO;

public interface IObtenerDiplomaService {

    StudentWithMessageDTO analyzeScores(Long studentId);
}
