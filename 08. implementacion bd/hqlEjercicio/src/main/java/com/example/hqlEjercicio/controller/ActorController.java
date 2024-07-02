package com.example.hqlEjercicio.controller;

import com.example.hqlEjercicio.model.Actor;
import com.example.hqlEjercicio.repository.IActorRepository;
import com.example.hqlEjercicio.service.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {
    @Autowired
    private IActorService actorService;

    @GetMapping("/listFavoriteMovie")
    public ResponseEntity <List<Actor>> listFavoriteMovie() {
        return new ResponseEntity<>(actorService.listarActoresConPeliculasFavoritas(), HttpStatus.OK);
    }

}
