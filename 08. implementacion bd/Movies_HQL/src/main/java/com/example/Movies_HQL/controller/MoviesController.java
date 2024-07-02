package com.example.Movies_HQL.controller;

import com.example.Movies_HQL.dto.ActorDTO;
import com.example.Movies_HQL.model.Actor;
import com.example.Movies_HQL.service.IMoviesService;
import com.example.Movies_HQL.service.MoviesService;
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

    @GetMapping("/ActorsFavorites")
    public ResponseEntity<List<Actor>> traerActoresConMovieFavorite() {
        return new ResponseEntity<>(service.traerActoresConMovieFavorite(), HttpStatus.OK);
    }

    @GetMapping("/ActorsPorRating/{rating}")
    public ResponseEntity<List<Actor>> traerActoresPorRating(@PathVariable Double rating) {
        return new ResponseEntity<>(service.traerActoresPorRating(rating), HttpStatus.OK);
    }

    @GetMapping("/ActorsPorPelicula/{nombrePelicula}")
    public ResponseEntity<List<ActorDTO>> traerActoresQueTrabajan(@PathVariable String nombrePelicula) {
        List<ActorDTO> actors = service.traerActoresQueTrabajan(nombrePelicula);
        return ResponseEntity.ok(actors);
    }

    @GetMapping("/PeliculasPorRatingActores/{rating}")
    public ResponseEntity<List<String>> traerPeliculasPorRatingActores(@PathVariable Double rating) {
        return new ResponseEntity<>(service.traerPeliculasPorRatingDeActores(rating), HttpStatus.OK);
    }




}
