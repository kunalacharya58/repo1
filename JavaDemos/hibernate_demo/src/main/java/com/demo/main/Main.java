package com.demo.main;

import org.hibernate.Transaction;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.model.Trainee;

public class Main {

	public static void main(String[] args) {
		
		// 1. configure
		Configuration configuration = 
				new Configuration().configure();
		
		// 2. builder
		StandardServiceRegistryBuilder builder = 
				new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		
		// 3. create session factory
		SessionFactory factory =
				configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		// begin writing here
		Query query = session.createQuery("from com.demo.model.Trainee");
		List<Trainee> trainees = query.list();
		for (Trainee t : trainees) {
			System.out.println(t);
		}
		
		// close
		transaction.commit();
		session.close();
		factory.close();
	}

}
