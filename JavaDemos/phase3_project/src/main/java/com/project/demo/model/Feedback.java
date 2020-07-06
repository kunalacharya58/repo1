package com.project.demo.model;

/*
JSON Body:
{
	"id": 1,
	"username": "jarvis7698",
	"response": "please make this project fast",
	"rating": 5
}
 */

public class Feedback {
	
	private int id;
	private String username;
	private String response;
	private int rating;
	
	public Feedback() {
		// TODO Auto-generated constructor stub
	}

	public Feedback(String username, String response, int rating) {
		super();
		this.username = username;
		this.response = response;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
