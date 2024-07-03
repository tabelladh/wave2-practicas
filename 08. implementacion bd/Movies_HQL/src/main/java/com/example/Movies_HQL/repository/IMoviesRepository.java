package com.example.Movies_HQL.repository;

import com.example.Movies_HQL.model.Actor;
import com.example.Movies_HQL.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMoviesRepository extends JpaRepository<Movie, Integer> {

    //MEJORAMOS EL RESULTADO DE ACTORES CON PELICULA FAVORITA
    @Query("SELECT a.firstName, a.lastName, m.title FROM Actor a JOIN a.movieFavorite m WHERE a.movieFavorite IS NOT NULL")
    List<Object[]> findByActorsMovies();

    @Query("SELECT a FROM Actor a WHERE a.rating > :rating")
    List<Actor> findByRating(@Param("rating") Double rating);

    @Query("SELECT a.firstName, a.lastName, m.title FROM Actor a JOIN a.movies m WHERE m.title LIKE %:nombrePelicula%")
    //traer los actores que trabajan en distintas peliculas, "a.movie"(es el atributo dentro de Actor que crea la relacion con Movie)
    //En JPQL no es necesario hacer las uniones de la (clase con la tabla intermedia) y luego de la (tabla intermedia con la otra clase) relacionada!! YA QUE ESTÁ DEFINIDO
    List<Object[]> findByTitle(@Param("nombrePelicula") String nombrePelicula);
    //Lo devuelvo como una lista de objetos[] (sacar los datos que necesito) para despues armar mi respuesta

    @Query("SELECT DISTINCT m.title FROM Movie m JOIN m.actors a WHERE a.rating > :rating")
    List<String> findByMoviesRatingActors(@Param("rating") Double rating);

    @Query("SELECT m.title, g.name FROM Movie m JOIN m.genre g WHERE g.name LIKE %:genero%")
    List<Object[]> findByMovieGenre(@Param("genero") String genero);
    //Lo mismo que el caso anterior (no es necesario declarar la union ni el como se unen) solo se declara el ATRIBUTO responsable de la relacion con la otra TABLA


    @Query("SELECT s.title, COUNT(ss.id) FROM Serie s JOIN s.seasons ss GROUP BY s.id, s.title HAVING COUNT(ss.id) > :season")
    List<Object[]> findBySeriesSeason(@Param("season") Integer season);

}
