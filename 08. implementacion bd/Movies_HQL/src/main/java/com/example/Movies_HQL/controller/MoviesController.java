package com.example.Movies_HQL.controller;

import com.example.Movies_HQL.dto.ActorDTO;
import com.example.Movies_HQL.dto.ResponseDTO;
import com.example.Movies_HQL.dto.ResponseDTOII;
import com.example.Movies_HQL.dto.ResponseDTOIII;
import com.example.Movies_HQL.model.Actor;
import com.example.Movies_HQL.service.IMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    IMoviesService service;

    @GetMapping("/ActoresConMovieFavorita")
    public ResponseEntity<List<ResponseDTO>> traerActoresConPeliculaFavorita() {
        return new ResponseEntity<>(service.traerActoresConPeliculaFavorita(), HttpStatus.OK);
    }

    @GetMapping("/ActorsPorRating/{rating}")
    public ResponseEntity<List<ActorDTO>> traerActoresPorRating(@PathVariable Double rating) {
        return new ResponseEntity<>(service.traerActoresPorRating(rating), HttpStatus.OK);
    }

    @GetMapping("/ActorsPorPelicula/{nombrePelicula}")
    public ResponseEntity<List<ResponseDTO>> traerActoresQueTrabajan(@PathVariable String nombrePelicula) {
        List<ResponseDTO> actors = service.traerActoresQueTrabajan(nombrePelicula);
        return ResponseEntity.ok(actors);
    }

    @GetMapping("/PeliculasPorRatingActores/{rating}")
    public ResponseEntity<List<String>> traerPeliculasPorRatingActores(@PathVariable Double rating) {
        return new ResponseEntity<>(service.traerPeliculasPorRatingDeActores(rating), HttpStatus.OK);
    }

    @GetMapping("/PeliculasPorGenero/{genero}")
    public ResponseEntity<List<ResponseDTOIII>> traerPeliculasPorGenero(@PathVariable String genero) {
        return new ResponseEntity<>(service.traerPeliculasPorGenero(genero), HttpStatus.OK);
    }

    @GetMapping("/SeriesPorcCantTemporada/{season}")
    public ResponseEntity<List<ResponseDTOII>> traerSeriesPorTemporada(@PathVariable Integer season) {
        return new ResponseEntity<>(service.traerSeriesPorCantTemporadas(season), HttpStatus.OK);
    }


}
