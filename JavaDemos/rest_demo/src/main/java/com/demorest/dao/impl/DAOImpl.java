package com.demorest.dao.impl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demorest.dao.DAO;
import com.demorest.model.Movie;

public class DAOImpl implements DAO {
	
	private Configuration configuration = new Configuration().configure();
	private StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
	private SessionFactory factory = null;
	private Session session = null;
	private Transaction transaction = null;
	
	// repetitive session begin;
	private void beginSession() {
		factory = configuration.buildSessionFactory(builder.build());
		session = factory.openSession();
		transaction = session.beginTransaction();
	}
	
	// repetitive session close;
	private void closeSession() {
		transaction.commit();
		session.close();
		factory.close();
	}
	
	@Override
	public Movie createMovie(Movie movie) {
		beginSession();
		session.save(movie);
		closeSession();
		return movie;
	}

	@Override
	public Movie updateMovie(Movie movie) {
		beginSession();
		session.update(movie);
		closeSession();
		return movie;
	}

	@Override
	public Movie getMovieById(int id) {
		Movie movie = null;
		beginSession();
		movie = (Movie)session.get(Movie.class, id);
		closeSession();
		return movie;
	}

	@Override
	public void removeMovie(int id) {
		Movie movie = new Movie();
		movie.setId(id);
		beginSession();
		session.delete(movie);
		closeSession();
	}

	@Override
	public List<Movie> getAllMovies() {
		beginSession();
		List<Movie> movieList = session.createQuery("from com.demorest.model.Movie").list();
		closeSession();
		return movieList;
	}

}
