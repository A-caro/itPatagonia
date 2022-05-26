package com.itpatagonia.patagoniansmovie.controller;

import com.itpatagonia.patagoniansmovie.model.Movie;
import com.itpatagonia.patagoniansmovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;


    @GetMapping
    public List<Movie> findAllMovies(){
        return movieService.getMovies();
    }


    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie){
        return movieService.saveMovie(movie);
    }

    @GetMapping("/{id}")
    public Optional<Movie> getMovieById(@PathVariable int id){
        return movieService.findById(id);
    }

}
