package com.anthony.cinemadb.api.repository;

import com.anthony.cinemadb.api.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}