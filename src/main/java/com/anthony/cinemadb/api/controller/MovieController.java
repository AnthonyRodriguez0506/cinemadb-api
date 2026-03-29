package com.anthony.cinemadb.api.controller;
import com.anthony.cinemadb.api.model.Movie;
import com.anthony.cinemadb.api.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")

public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Movie getMovieById (@PathVariable Integer id){
        return movieService.getMovieById(id);
    }

    @PostMapping
    public Movie createMovie (@RequestBody Movie movie) {
        return movieService.createMovie(movie);
    }

    @PutMapping("/{id}")
    public Movie updateMovie (@PathVariable Integer id, @RequestBody Movie movie) {
        return movieService.updateMovie(id, movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie (@PathVariable Integer id) {
        movieService.deleteMovie(id);
    }
}