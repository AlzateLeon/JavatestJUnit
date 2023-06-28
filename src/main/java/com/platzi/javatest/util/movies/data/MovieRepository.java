package com.platzi.javatest.util.movies.data;


import com.platzi.javatest.util.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {

    Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}