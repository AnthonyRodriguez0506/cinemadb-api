package com.anthony.cinemadb.api.service;
import com.anthony.cinemadb.api.model.Movie;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service

public class MovieService {
    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getAllMovies () {
        return movies;
    }

    public Movie getMovieById(Integer id) {
        return movies.stream()
                .filter(movie -> movie.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Movie createMovie (Movie movie) {
            movies.add(movie);
        return movie;
    }

    public Movie updateMovie (Integer id, Movie movie) {
        Movie existingMovie = getMovieById(id);
        existingMovie.setTitle(movie.getTitle());
        existingMovie.setYear(movie.getYear());
        existingMovie.setDuration(movie.getDuration());
        existingMovie.setRating(movie.getRating());
        existingMovie.setDirector(movie.getDirector());
        return existingMovie;
    }

    public void deleteMovie (Integer id) {
        Movie deletingMovie = getMovieById(id);
        movies.remove(deletingMovie);
    }

}