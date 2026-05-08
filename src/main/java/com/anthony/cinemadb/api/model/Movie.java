package com.anthony.cinemadb.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

    public Movie() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer id;
    private String title;
    private Integer year;
    private Integer duration;
    private Float rating;
    private String director;

    public Movie(Integer id, String title, Integer year, Integer duration, Float rating, String director) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.rating = rating;
        this.director = director;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getDuration() {
        return duration;
    }

    public Float getRating() {
        return rating;
    }

    public String getDirector() {
        return director;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
