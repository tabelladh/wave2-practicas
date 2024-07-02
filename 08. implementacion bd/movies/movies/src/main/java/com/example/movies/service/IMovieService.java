package com.example.movies.service;

import com.example.movies.model.Movie;

import java.util.List;

public interface IMovieService {

    List<String> listarPeliculasConActoresYRatingMayorAlParametro(Integer num);
}
