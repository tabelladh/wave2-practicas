package com.example.movies.service;

import com.example.movies.entity.Actor;
import com.example.movies.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    ActorRepository repository;

    @Override
    public List<Actor> findAllActor() {
        return repository.findAllActors();
    }
}
