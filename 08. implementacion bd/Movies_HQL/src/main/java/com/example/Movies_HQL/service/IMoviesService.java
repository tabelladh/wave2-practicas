package com.example.Movies_HQL.service;

import com.example.Movies_HQL.dto.ActorDTO;
import com.example.Movies_HQL.model.Actor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IMoviesService {

    List<Actor> traerActoresConMovieFavorite();

    List<Actor> traerActoresPorRating(Double rating);

    List<ActorDTO> traerActoresQueTrabajan(String nombrePelicula);

    List<String> traerPeliculasPorRatingDeActores(Double rating);

//    List<ActorDTO> traerPeliculasPorGenero(String genero);
}
