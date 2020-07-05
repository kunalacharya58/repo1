package com.demorest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String leadActor;
	private String leadActress;
	private float rating;
	private int boxOffice;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String name, String leadActor, String leadActress, float rating, int boxOffice) {
		super();
		this.name = name;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.rating = rating;
		this.boxOffice = boxOffice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public String getLeadActress() {
		return leadActress;
	}

	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(int boxOffice) {
		this.boxOffice = boxOffice;
	}

	@Override
	public String toString() {
		return "\nMovie id=" + id + ". name=" + name + "\nleadActor=" + leadActor + ", leadActress=" + leadActress
				+ "\nRatings=" + rating + ", Earned(Crores)=" + boxOffice;
	}
	
	
}
