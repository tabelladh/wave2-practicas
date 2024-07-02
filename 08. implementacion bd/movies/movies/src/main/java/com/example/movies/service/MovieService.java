package com.example.movies.service;

import com.example.movies.model.Movie;
import com.example.movies.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements IMovieService {

    @Autowired
    private IMovieRepository movieRepository;

    @Override
    public List<String> listarPeliculasConActoresYRatingMayorAlParametro(Integer num) {
        return movieRepository.findByRatingGreaterThan(num);
    }
}
