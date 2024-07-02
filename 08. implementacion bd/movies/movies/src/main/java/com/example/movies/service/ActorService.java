package com.example.movies.service;

import com.example.movies.model.Actor;
import com.example.movies.repository.IActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService implements IActorService{

    @Autowired
    private IActorRepository actorRepository;

    public List<Actor> ListarActoresConPelisFavoritas() {
        return actorRepository.findActorsWithFavoriteMovies();
    }

    @Override
    public List<Actor> ListarActoresConRatingPorParametro(Integer num) {
        return actorRepository.listActorsWithRatingForParams(num);
    }

    @Override
    public List<Actor> ListarActoresSegunPelisPorParametro(String movieTitle) {
        return actorRepository.listActorsByMovieTitle(movieTitle);
    }

}
