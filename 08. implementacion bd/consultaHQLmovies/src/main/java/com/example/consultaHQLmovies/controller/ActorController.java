package com.example.consultaHQLmovies.controller;

import com.example.consultaHQLmovies.model.Actor;
import com.example.consultaHQLmovies.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ActorController {

    private final ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("/actors/favorite-movie")
    public List<Actor> getAllActorsFavoriteMovie() {
        return actorService.findAllActorsFavoriteMovie();
    }
    @GetMapping("/actors/rating-max-param")
    public List<Actor> getAllActorsWithRatingGreaterThan(@RequestParam double rating) {
        return actorService.findAllActorRatingMax(rating);
    }

    @GetMapping("/in-movie")
    public List<Actor> getActorsInMovie(@RequestParam("movieTitle") String movieTitle) {
        return actorService.findActorsInMovie(movieTitle);
    }
}
