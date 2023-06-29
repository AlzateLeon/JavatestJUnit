package com.platzi.javatest.util.movies.data;

import com.platzi.javatest.util.movies.model.Genre;
import com.platzi.javatest.util.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class MovieRepositoryJdbc implements  MovieRepository {

    private final JdbcTemplate jdbcTemplate;

    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        return null;
    }

    @Override
    public Collection<Movie> findAll() {
        return jdbcTemplate.query("select * from movies", crearMapa());
    }

    @Override
    public void saveOrUpdate(Movie movie) {

    }

    private static RowMapper<Movie> crearMapa(){
        RowMapper<Movie> movieMapper = new RowMapper<Movie>() {
            @Override
            public Movie mapRow(ResultSet resultSet, int i) throws SQLException {
                return new Movie(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("minutes"),
                        Genre.valueOf(resultSet.getString("genre")));
            }
        };

        return movieMapper;
    }
}
