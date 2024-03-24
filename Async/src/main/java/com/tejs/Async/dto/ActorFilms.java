package com.tejs.Async.dto;

import java.util.List;

import com.tejs.Async.entity.Actor;
import com.tejs.Async.entity.Customer;
import com.tejs.Async.entity.Film;

import lombok.Data;

@Data
public class ActorFilms {

    List<Actor> actors ;
    List<Film> films;
    List<Customer> customers;
    
}
