package com.example.consultaHQLmovies.service;

import com.example.consultaHQLmovies.model.Actor;
import com.example.consultaHQLmovies.repository.IActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActorService {

    private final IActorRepository actorRepository;

    @Autowired
    public ActorService(IActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> findAllActorsFavoriteMovie() {
        return actorRepository.findAllActorsFavoriteMovie();
    }

    public List<Actor> findAllActorRatingMax(double rating) {
        return actorRepository.findAllActorRatingMax(rating);
    }

    public List<Actor> findActorsInMovie(String movieTitle) {
        return actorRepository.findActorsInMovie(movieTitle);
    }

}
