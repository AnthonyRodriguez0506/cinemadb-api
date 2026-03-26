package com.anthony.cinemadb.api.model;

public class Movie {

    private Integer id;
    private String title;
    private Integer year;
    private Integer duration;
    private Float rating;
    private String director;

    // Constructor
    public Movie(Integer id, String title, Integer year, Integer duration, Float rating, String director) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.rating = rating;
        this.director = director;
    }

    // Getters

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

    // Setters
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
