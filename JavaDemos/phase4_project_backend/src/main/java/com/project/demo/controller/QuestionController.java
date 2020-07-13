package com.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.model.Question;
import com.project.demo.service.QuestionService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class QuestionController {
	
	@Autowired
	private QuestionService service;

	@PostMapping("/question")
	public Question createQuestion(@RequestBody Question question) {
		return service.createQuestion(question);
	}

	@GetMapping("/questions")
	public List<Question> getAllQuestions() {
		return service.getAllQuestions();
	}

}
