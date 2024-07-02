package com.example.movies.controler;

import com.example.movies.model.Movie;
import com.example.movies.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieControler {

    @Autowired
    private IMovieService iMovieService;

    @GetMapping("/findByMovieForRatingTheActors/{num}")
    public ResponseEntity<List<String>> findByRatingGreaterThan(@PathVariable Integer num) {
        return new ResponseEntity<>(iMovieService.listarPeliculasConActoresYRatingMayorAlParametro(num), HttpStatus.OK);
    }
}
