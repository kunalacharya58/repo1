package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "new_trainee")
public class Trainee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	//@Column(name="customColumnName", nullable = false, length=30)
	private String name;
	
	@Column(unique = false, nullable = true)
	private long contact;
	
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	
	public Trainee(String name, long contact) {
		super();
		this.name = name;
		this.contact = contact;
	}
	
	public Trainee(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

}
