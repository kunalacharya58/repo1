package com.demorest.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import com.demorest.model.Movie;
import com.demorest.service.impl.ServiceImpl;

@Path("/movie")
public class Controller {
	
	private ServiceImpl service = new ServiceImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Movie getMovie(Movie movie) {
		return service.createMovie(movie);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Movie updateMovie(Movie movie) {
		return service.updateMovie(movie);
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Movie getMovieById(@PathParam("id") int id) {
		return service.getMovieById(id);
	}
	
	@DELETE
	@Path("/{id}")
	public void removeMoviebyId(@PathParam("id") int id) {
		service.removeMovie(id);
	}
	

}
