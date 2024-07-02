package com.example.movies.repository;

import com.example.movies.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IActorRepository extends JpaRepository<Actor, Integer> {

    // Listar todos los actores que tengan declarada una película favorita.
    @Query ("select a from Actor a where a.favoriteMovieId is not null")
    List<Actor> findActorsWithFavoriteMovies();

    // Listar todos los actores que tengan rating superior a <valor recibido por parámetro>
    @Query("select a from Actor a where a.rating > :num")
    List<Actor> listActorsWithRatingForParams(@Param("num") Integer num);

    // Listar todos los actores que trabajan en la <película recibida por parámetro>
    @Query("SELECT a FROM Actor a JOIN a.movies m WHERE m.title = :movieTitle")
    //traer los actores que trabajan en distintas peliculas, "a.movie"(es el atributo dentro de Actor que crea la relacion con Movie)
    //En JPQL no es necesario hacer las uniones de la (clase con la tabla intermedia)
    // y luego de la (tabla intermedia con la otra clase) relacionada!! YA QUE ESTÁ DEFINIDO
    List<Actor> listActorsByMovieTitle(@Param("movieTitle") String movieTitle);

}
