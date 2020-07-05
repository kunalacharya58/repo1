package com.demorest.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demorest.model.Movie;
import com.demorest.service.impl.ServiceImpl;

@Path("/movies")
public class SearchController {
	
	private ServiceImpl service = new ServiceImpl();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Movie> getAllMovies() {
		return service.getAllMovies();
	}

}
