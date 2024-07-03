package com.example.Movies_HQL.service;

import com.example.Movies_HQL.dto.ActorDTO;
import com.example.Movies_HQL.dto.ResponseDTO;
import com.example.Movies_HQL.dto.ResponseDTOII;
import com.example.Movies_HQL.dto.ResponseDTOIII;
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
    public List<ResponseDTO> traerActoresConPeliculaFavorita() {
        List<Object[]> results = repository.findByActorsMovies();

        List<ResponseDTO> actorsConPeliculaFavorita = new ArrayList<>();

        for (Object[] result : results) {
            String nombreActor = (String) result[0];
            String apellidoActor = (String) result[1];
            String titlePeliculaFavorita = (String) result[2];

            String nombreCompleto = nombreActor + " " + apellidoActor;
            ResponseDTO actorConPeliculaFavorita = new ResponseDTO(nombreCompleto, titlePeliculaFavorita);
            actorsConPeliculaFavorita.add(actorConPeliculaFavorita);
        }

        return actorsConPeliculaFavorita;
    }


    @Override
    public List<ActorDTO> traerActoresPorRating(Double rating) {
        List<Actor> actorsPorRating = repository.findByRating(rating);

        List<ActorDTO> actorsList = new ArrayList<>();

        for (Actor actor : actorsPorRating) {
            String nombreActor = actor.getFirstName();
            String apellidoActor = actor.getLastName();
            Double ratingActor = actor.getRating();

            ActorDTO actorsDTO = new ActorDTO(nombreActor + " "+ apellidoActor, ratingActor);
            actorsList.add(actorsDTO);
        }
        return actorsList;
    }

    @Override
    public List<ResponseDTO> traerActoresQueTrabajan(String nombrePelicula) {

        List<Object[]> results = repository.findByTitle(nombrePelicula); //guardo los resultados de mi consulta SQL (@Query)

        List<ResponseDTO> actors = new ArrayList<>(); //Inicializo una lista de ActorDTO

        for (Object[] result : results) { //
            String nombre = (String) result[0]; //obtengo el nombre del Actor
            String apellido = (String) result[1]; //obtengo el apellido del Actor
            String titlePelicula = (String) result[2]; //obtengo el titulo de la pelicula

            //Es un objeto de 3 elementos (los 3 datos que pido mostrar en mi consutla SQL)

            String nombreActor = nombre + " " + apellido; //creo uno de los datos de mi ActorDTO
            ResponseDTO actorsDTO = new ResponseDTO(nombreActor, titlePelicula); //Creo mi ActorDTO que quiero mostrar ()
            actors.add(actorsDTO); //por cada resultado encontrado crearme el ActorDTO y guardarlo en la lista actors
        }
        return actors;
    }

    @Override
    public List<String> traerPeliculasPorRatingDeActores(Double rating) {
        List<String> peliculas = repository.findByMoviesRatingActors(rating);

        return peliculas;
    }

    @Override
    public List<ResponseDTOIII> traerPeliculasPorGenero(String genero) {
        List<Object[]> results = repository.findByMovieGenre(genero);

        List<ResponseDTOIII> peliculasPorGenero = new ArrayList<>();

        for (Object[] result : results) {
            String titlePelicula = (String) result[0];
            String generoPelicula = (String) result[1];

            ResponseDTOIII peliculaDTO = new ResponseDTOIII(titlePelicula, generoPelicula);
            peliculasPorGenero.add(peliculaDTO);
        }

        return peliculasPorGenero;
    }

    @Override
    public List<ResponseDTOII> traerSeriesPorCantTemporadas(Integer season) {
        List<Object[]> results = repository.findBySeriesSeason(season);

        List<ResponseDTOII> seriesPorTemporada = new ArrayList<>();

        for (Object[] result : results) {
            String titleSerie = (String) result[0];
            Long seasonSerie = (Long) result[1];

            ResponseDTOII serieDTO = new ResponseDTOII(titleSerie, seasonSerie);
            seriesPorTemporada.add(serieDTO);

        }
        return seriesPorTemporada;
    }




}
