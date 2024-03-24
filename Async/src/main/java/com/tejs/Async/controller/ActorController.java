package com.tejs.Async.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.tejs.Async.dto.ActorFilms;
import com.tejs.Async.entity.Actor;
import com.tejs.Async.service.ActorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ActorController {

    @Autowired
    private ActorService actorService;


    @GetMapping("/a")
    public ResponseEntity<ActorFilms> getAllActors(){
        return ResponseEntity.ok(actorService.getAllActorFilms());
    } 
    @GetMapping("/b")
    public ResponseEntity<ActorFilms> getAllActorsFilmsWithoutAsync(){
        return ResponseEntity.ok(actorService.getAllActorFilmsWithoutAsync());
    } 
    
}
