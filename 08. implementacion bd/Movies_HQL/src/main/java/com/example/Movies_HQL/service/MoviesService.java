package com.example.Movies_HQL.service;

import com.example.Movies_HQL.dto.ActorDTO;
import com.example.Movies_HQL.model.Actor;
import com.example.Movies_HQL.repository.IMoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoviesService implements IMoviesService{

    @Autowired
    IMoviesRepository repository;

    @Override
    public List<Actor> traerActoresConMovieFavorite() {

        List<Actor> favorites = repository.findByMovieFavorites();

        return favorites;
    }

    @Override
    public List<Actor> traerActoresPorRating(Double rating) {
        List<Actor> actorsPorRating = repository.findByRating(rating);
        return actorsPorRating;
    }

    @Override
    public List<ActorDTO> traerActoresQueTrabajan(String nombrePelicula) {

        List<Object[]> results = repository.findByTitle(nombrePelicula); //guardo los resultados de mi consulta SQL (@Query)

        List<ActorDTO> actors = new ArrayList<>(); //Inicializo una lista de ActorDTO

        for (Object[] result : results) { //
            String nombre = (String) result[0]; //obtengo el nombre del Actor
            String apellido = (String) result[1]; //obtengo el apellido del Actor
            String titlePelicula = (String) result[2]; //obtengo el titulo de la pelicula

            //Es un objeto de 3 elementos (los 3 datos que pido mostrar en mi consutla SQL)

            String nombreActor = nombre + " " + apellido; //creo uno de los datos de mi ActorDTO
            ActorDTO actorsDTO = new ActorDTO(nombreActor, titlePelicula); //Creo mi ActorDTO que quiero mostrar ()
            actors.add(actorsDTO); //por cada resultado encontrado crearme el ActorDTO y guardarlo en la lista actors
        }
        return actors;
    }

    @Override
    public List<String> traerPeliculasPorRatingDeActores(Double rating) {
        List<String> peliculas = repository.findByMoviesRatingActors(rating);

        return peliculas;
    }

//    @Override
//    public List<ActorDTO> traerPeliculasPorGenero(String genero) {
//        List<Object[]> results = repository.findByMovieGenre(genero);
//
//        List<ActorDTO> peliculas = new ArrayList<>();
//
//        for (Object[] result : results) {
//            String titlePelicula = (String) result[0];
//            String generoPelicula = (String) result[1];
//
//            ActorDTO peliculaDTO = new ActorDTO(titlePelicula, generoPelicula);
//            peliculas.add(peliculaDTO);
//        }
//
//        return peliculas;
//    }


}
