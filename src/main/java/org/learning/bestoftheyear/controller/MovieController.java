package org.learning.bestoftheyear.controller;

import org.learning.bestoftheyear.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @GetMapping
    public String movieList(Model model) {
        List<Movie> movies = getMovies();
        model.addAttribute("movies", movies);
        return "movies-list";

    }

    @GetMapping("/details")
    public String movieDetailsPath(@RequestParam String movieId, Model model) {
        Movie movie = getMovieById(movieId);
        model.addAttribute("movie", movie);
        return "movie-details";

    }


    private Movie getMovieById(String id) {
        Movie movie = null;
        for (Movie m : getMovies()) {
            if (id.equals(m.getId())) {
                movie = m;
                break;
            }

        }
        return movie;

    }


    private List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Mr. Nobody", "Jaco Van Dormael", "aaa"));
        movies.add(new Movie("Promising Young Woman", "Emerald Fennell", "bbb"));

        return movies;
    }


}
