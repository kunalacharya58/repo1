package com.demorest.dao;

import java.util.List;

import com.demorest.model.Movie;

public interface DAO {
	
	public Movie createMovie(Movie movie);
	public Movie updateMovie(Movie movie);
	public Movie getMovieById(int id);
	public void removeMovie(int id);
	public List<Movie> getAllMovies();

}
