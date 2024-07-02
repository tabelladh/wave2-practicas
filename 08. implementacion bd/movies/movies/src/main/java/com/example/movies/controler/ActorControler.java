package com.example.movies.controler;

import com.example.movies.model.Actor;
import com.example.movies.service.ActorService;
import com.example.movies.service.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorControler {

    @Autowired
    private IActorService iActorService;

    @GetMapping("/listActorWithMovieFavorite")
    public ResponseEntity<List<Actor>> listActorWithMovieFavorite() {
        return new ResponseEntity<>(iActorService.ListarActoresConPelisFavoritas(), HttpStatus.OK);
    }

    @GetMapping("/listActorWithRatingForParams/{num}")
    public ResponseEntity<List<Actor>> listActorWithRatingForParams(@PathVariable Integer num) {
        return new ResponseEntity<>(iActorService.ListarActoresConRatingPorParametro(num), HttpStatus.OK);
    }

    @GetMapping("/listActorsByMovieTitle/{title}")
    public ResponseEntity<List<Actor>> getActorById(@PathVariable String title) {
        return new ResponseEntity<>(iActorService.ListarActoresSegunPelisPorParametro(title), HttpStatus.OK);
    }
}
