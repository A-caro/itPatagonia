package com.itpatagonia.patagoniansmovie.service;

import com.itpatagonia.patagoniansmovie.model.Movie;
import com.itpatagonia.patagoniansmovie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {


    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getMovies(){
        return movieRepository.findAll();
    }


    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Optional<Movie> findById(int id) {
        return movieRepository.findById(id);
    }
}
