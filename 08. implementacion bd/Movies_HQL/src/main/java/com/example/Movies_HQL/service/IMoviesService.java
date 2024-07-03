package com.example.Movies_HQL.service;

import com.example.Movies_HQL.dto.ActorDTO;
import com.example.Movies_HQL.dto.ResponseDTO;
import com.example.Movies_HQL.dto.ResponseDTOII;
import com.example.Movies_HQL.dto.ResponseDTOIII;
import com.example.Movies_HQL.model.Actor;

import java.util.List;


public interface IMoviesService {

    List<ResponseDTO> traerActoresConPeliculaFavorita();

    List<ActorDTO> traerActoresPorRating(Double rating);

    List<ResponseDTO> traerActoresQueTrabajan(String nombrePelicula);

    List<String> traerPeliculasPorRatingDeActores(Double rating);

    List<ResponseDTOIII> traerPeliculasPorGenero(String genero);

    List<ResponseDTOII> traerSeriesPorCantTemporadas (Integer season);

}
