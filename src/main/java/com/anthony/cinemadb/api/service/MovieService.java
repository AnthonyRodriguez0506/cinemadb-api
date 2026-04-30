package com.anthony.cinemadb.api.service;
import com.anthony.cinemadb.api.model.Movie;
import com.anthony.cinemadb.api.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Service

public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies () {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Integer id) {
        return movieRepository.findById(id)
                .orElse(null);
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie updateMovie (Integer id, Movie movie) {
        Movie existingMovie = getMovieById(id);
        existingMovie.setTitle(movie.getTitle());
        existingMovie.setYear(movie.getYear());
        existingMovie.setDuration(movie.getDuration());
        existingMovie.setRating(movie.getRating());
        existingMovie.setDirector(movie.getDirector());
        return movieRepository.save(existingMovie);
    }

    public void deleteMovie (Integer id) {
        movieRepository.deleteById(id);
    }
}