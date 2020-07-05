package com.demorest.service;

import java.util.List;

import com.demorest.model.Movie;

public interface Service {

	public Movie createMovie(Movie movie);
	public Movie updateMovie(Movie movie);
	public Movie getMovieById(int id);
	public void removeMovie(int id);
	public List<Movie> getAllMovies();
}
