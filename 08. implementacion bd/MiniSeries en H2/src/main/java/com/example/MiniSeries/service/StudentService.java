package com.example.MiniSeries.service;

import com.example.MiniSeries.repository.IMiniserieRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final IMiniserieRepository IMiniserieRepository;

    public StudentService(IMiniserieRepository IMiniserieRepository) {
        this.IMiniserieRepository = IMiniserieRepository;
    }
}
