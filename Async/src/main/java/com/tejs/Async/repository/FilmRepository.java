package com.tejs.Async.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tejs.Async.entity.Film;


public interface FilmRepository extends JpaRepository<Film,Integer> {
 
    
} 