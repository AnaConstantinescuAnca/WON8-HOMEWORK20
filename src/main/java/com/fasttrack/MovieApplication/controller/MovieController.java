package com.fasttrack.MovieApplication.controller;

import com.fasttrack.MovieApplication.model.Movie;
import com.fasttrack.MovieApplication.service.MovieRepository;
import com.fasttrack.MovieApplication.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("movies")    // http://localhost:8080/movies
public class MovieController {

    private final MovieService movieService;

    @GetMapping
    public List<Movie> getAll(){
        return movieService.getAllMovies();
    }
}
