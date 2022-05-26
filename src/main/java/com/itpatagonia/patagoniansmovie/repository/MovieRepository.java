package com.itpatagonia.patagoniansmovie.repository;

import com.itpatagonia.patagoniansmovie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
