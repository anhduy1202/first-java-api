package com.example.demo.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository MovieRepository;
    public List<Movie> getAllMovies() {
        return MovieRepository.findAll();
    }    
}
