package dev.mandar.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRep;
    public List<Movie> allMovies(){
        return movieRep.findAll();
    }

}
