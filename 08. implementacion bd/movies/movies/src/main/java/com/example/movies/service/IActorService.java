package com.example.movies.service;

import com.example.movies.model.Actor;

import java.util.List;

public interface IActorService {
    List<Actor> ListarActoresConPelisFavoritas();

    List<Actor> ListarActoresConRatingPorParametro(Integer num);

    List<Actor> ListarActoresSegunPelisPorParametro(String movieTitle);
}
