package com.movieflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieflix.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
