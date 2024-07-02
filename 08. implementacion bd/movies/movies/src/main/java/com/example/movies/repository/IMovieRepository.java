package com.example.movies.repository;

import com.example.movies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMovieRepository extends JpaRepository<Movie, Integer> {

    // Listar todas las películas cuyos actores tengan rating superior a <valor recibido por parámetro>
    @Query("select Distinct m.title from Movie m Join m.actors a where a.rating > :num")
    List<String> findByRatingGreaterThan(@Param("num") Integer num);


}
