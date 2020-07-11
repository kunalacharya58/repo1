package com.project.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.project.demo.dao.QuestionDAO;
import com.project.demo.model.Question;

@Component
public class DatabaseInit implements CommandLineRunner {
	
	@Autowired
	private QuestionDAO dao;

	@Override
	public void run(String... args) throws Exception {
		this.dao.deleteAll();
		
		System.out.println("\n>>>>Inititalizing database population with dummy data...");
		
		String solutions[] = {"OPT1", "OPT3", "OPT4", "OPT2", "OPT3", "OPT2", "OPT3", "OPT2", "OPT1", "OPT4"};
		String q = "This is a DUMMY QUESTION. Correct option for this is ";
		for (String answer : solutions) {
			Question question = new Question(q+answer+".", "DUMMY OPT1", "DUMMY OPT2", "DUMMY OPT3", "DUMMY OPT4", answer);
			dao.save(question);
		}
		
		System.out.println("\n>>>>Database populated succesfully!");
		
	}

}
