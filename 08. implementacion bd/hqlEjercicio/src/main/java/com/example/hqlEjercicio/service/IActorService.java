package com.example.hqlEjercicio.service;

import com.example.hqlEjercicio.model.Actor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IActorService {
    public List<Actor> listarActoresConPeliculasFavoritas();

    public List<Actor> listarActoresConRatingSuperiorA();
}
