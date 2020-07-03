package com.demo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.model.Course;
import com.demo.model.Student;
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
//		String[] teachers = {"Otto Octavius", "Walter White", "Skyler White", "Paul Rudd"};
//		
//		for (String t : teachers) {
//			String[] name = t.split(" ");
//			Teacher T = new Teacher(name[0], name[1]);
//			System.out.println(T);
//			session.save(T);S
//		}
//		
//		String[] students = {"Skinny Peat", "Jesse Pinkman", "Peter Parker", "Edward Norton", "Harry Osborn"};
//		
//		for (String t : students) {
//			String[] name = t.split(" ");
//			Student S = new Student(name[0], name[1]);
//			System.out.println(S);
//			session.save(S);
//		} 
		
		String[] courses = {"Java", "Spring", "Hibernate", "REST API", "Maven", "Big Data"};
		for (String c : courses) {
			Course course = new Course(c, c.length());
			session.save(course);
		}
//		
//		Course c = new Course("Spring", 3);
//		session.save(c);
//		
		
		// close
		transaction.commit();
		session.close();
		factory.close();
	}

}
