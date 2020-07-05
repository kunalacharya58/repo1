package com.demorest.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demorest.model.Movie;

public class Main {

	public static void main(String[] args) {
		 Configuration configuration = new Configuration().configure();
		 StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		 SessionFactory factory = configuration.buildSessionFactory(builder.build());
		 Session session = factory.openSession();
		 Transaction transaction = session.beginTransaction();
		 
		 Movie m = new Movie("Kedarnath", "Sushant Singh Rajput", "Sara Ali Khan", 3.1f, 97);
		 session.save(m);
		 
		 transaction.commit();
		 session.close();
		 factory.close();

	}

}
