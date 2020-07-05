package com.demorest.service.impl;

import java.util.List;

import com.demorest.dao.impl.DAOImpl;
import com.demorest.model.Movie;
import com.demorest.service.Service;

public class ServiceImpl implements Service {
	
	private DAOImpl dao = new DAOImpl();

	@Override
	public Movie createMovie(Movie movie) {
		return dao.createMovie(movie);
	}

	@Override
	public Movie updateMovie(Movie movie) {
		return dao.updateMovie(movie);
	}

	@Override
	public Movie getMovieById(int id) {
		return dao.getMovieById(id);
	}

	@Override
	public void removeMovie(int id) {
		dao.removeMovie(id);
	}

	@Override
	public List<Movie> getAllMovies() {
		return dao.getAllMovies();
	}

}
