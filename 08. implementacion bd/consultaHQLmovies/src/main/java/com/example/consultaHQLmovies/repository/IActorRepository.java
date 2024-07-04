package com.example.consultaHQLmovies.repository;

import com.example.consultaHQLmovies.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IActorRepository extends JpaRepository<Actor, Integer> {
    @Query("SELECT a FROM Actor a WHERE a.favoriteMovieId IS NOT NULL")
    List<Actor> findAllActorsFavoriteMovie();

    @Query("SELECT a FROM Actor a WHERE a.rating > :rating")
    List<Actor> findAllActorRatingMax(@Param("rating") double rating);

    @Query("SELECT am.actor FROM ActorMovie am JOIN am.movie m WHERE m.title = :movieTitle")
    List<Actor> findActorsInMovie(@Param("movieTitle") String movieTitle);

}
