package com.platzi.javatest.util.movies.service;

import com.platzi.javatest.util.movies.data.MovieRepository;
import com.platzi.javatest.util.movies.model.Genre;
import com.platzi.javatest.util.movies.model.Movie;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class MovieServiceTest {

    private List<Movie> movies = new ArrayList<>();

    @Test
    public void returnMoviesByGenreAction() {

        MovieRepository mr = Mockito.mock(MovieRepository.class);
        Mockito.when(mr.findAll()).thenReturn(movies);
        MovieService movieService = new MovieService(mr);

        Collection<Movie> movies =  movieService.findMoviesByGenre(Genre.ACTION);

        //se valida que traiga las dos de accion
        assertTrue(movies.size() == 2);
    }

    @Test
    public void returnMoviesByDuration() {

        MovieRepository mr = Mockito.mock(MovieRepository.class);
        Mockito.when(mr.findAll()).thenReturn(movies);
        MovieService movieService = new MovieService(mr);

        //validacion
        Collection<Movie> movies = movieService.findMoviesByLength(111);

        assertEquals(2, movies.size());
    }

    @Before
    public void returnListActionMovies() {
        movies = Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "There's Something About Marty", 119, Genre.COMEDY),
                new Movie(4, "Super 8", 112, Genre.THRILLER),
                new Movie(5, "Scream", 111, Genre.HORROR),
                new Movie(6, "Home Alone", 103, Genre.COMEDY),
                new Movie(7, "Matrix", 136, Genre.ACTION)
        );
    }

}