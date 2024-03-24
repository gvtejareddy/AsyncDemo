package com.tejs.Async.service;


import com.tejs.Async.dto.ActorFilms;


public interface ActorService {
    ActorFilms getAllActorFilms();

    ActorFilms getAllActorFilmsWithoutAsync();
} 
