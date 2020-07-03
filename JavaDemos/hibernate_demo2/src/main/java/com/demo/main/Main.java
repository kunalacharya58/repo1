package com.demo.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.model.Teacher;

public class Main {

	public static void main(String[] args) {
		// 1. configure
		Configuration configuration = 
			new Configuration().configure();
				
		// 2. builder
		StandardServiceRegistryBuilder builder = 
			new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
				
		// 3. building session factory
		SessionFactory factory =
			configuration.buildSessionFactory(builder.build());
				
		// 4. creating a session object
		Session session = factory.openSession();
				
		// 5. Transaction
		Transaction transaction = session.beginTransaction();
				
		// begin writing here
		String[] teachers = {"Suman Jambekar", "Howard Packkard", "Skyler White", "Judy Greer"};
		
		for (String t : teachers) {
			String[] name = t.split(" ");
			Teacher T = new Teacher(name[0], name[1]);
			System.out.println(T);
			//session.save(T);
		}
		
		String[] students = {"Suman Jambekar", "Howard Packkard", "Skyler White", "Judy Greer"};
		
		// close
		transaction.commit();
		session.close();
		factory.close();
	}

}
