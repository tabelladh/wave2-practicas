package com.example.hqlEjercicio.repository;

import com.example.hqlEjercicio.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IActorRepository extends JpaRepository<Actor, Integer> {

    @Query("select a from Actor a where a.favoriteMovieId is not null")
    List<Actor> findActorsWithFavoriteMovie();

    @Query("FROM Actor a WHERE a.rating > :rating")
    List<Actor> findActorsWithRatingAbove(@Param("rating") Float rating);
}
