package com.example.hqlEjercicio.service;

import com.example.hqlEjercicio.model.Actor;
import com.example.hqlEjercicio.repository.IActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements IActorService{
    @Autowired
    private IActorRepository actorRepository;
    @Override
    public List<Actor> listarActoresConPeliculasFavoritas() {
        return actorRepository.findActorsWithFavoriteMovie();
    }

    @Override
    public List<Actor> listarActoresConRatingSuperiorA() {
        return List.of();
    }


}
