package com.tejs.Async.service.impl;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tejs.Async.dto.ActorFilms;
import com.tejs.Async.entity.Actor;
import com.tejs.Async.entity.Customer;
import com.tejs.Async.entity.Film;
import com.tejs.Async.repository.ActorRepository;
import com.tejs.Async.repository.CustomerRepository;
import com.tejs.Async.repository.FilmRepository;
import com.tejs.Async.service.ActorService;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorRepository actorRepository;

    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    @Qualifier("actorTaskExecutor")
    private Executor actorThreadPool;

    @Autowired
    @Qualifier("filmTaskExecutor")
    private Executor filmThreadPool;


    @Autowired
    @Qualifier("customerTaskExecutor")
    private Executor customerThreadPool;


    public ActorFilms getAllActorFilms() {

        CompletableFuture<List<Actor>> actorList = CompletableFuture.supplyAsync(() -> actorRepository.findAll(),
                actorThreadPool);

        CompletableFuture<List<Film>> filmList = CompletableFuture.supplyAsync(() -> filmRepository.findAll(),
                filmThreadPool);


                CompletableFuture<List<Customer>> customerList = CompletableFuture.supplyAsync(() -> customerRepository.findAll(),
                customerThreadPool);

        ActorFilms actorFilms = new ActorFilms();
        try {
            actorFilms.setActors(actorList.get());
            actorFilms.setFilms(filmList.get());
            actorFilms.setCustomers(customerList.get());
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return actorFilms;

    }


    public ActorFilms getAllActorFilmsWithoutAsync() {
        ActorFilms actorFilms = new ActorFilms();

        actorFilms.setActors(actorRepository.findAll());
        actorFilms.setFilms(filmRepository.findAll());
        actorFilms.setCustomers(customerRepository.findAll());

        return actorFilms;

    }
}
