package org.learning.bestoftheyear.model;

public class Movie {
    private String title;
    private String director;
    private String id;

    public Movie(String title, String director, String id) {
        this.title = title;
        this.director = director;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
