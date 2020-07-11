package com.project.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.demo.model.Question;

@Service
public interface QuestionService {
	
	public Question createQuestion(Question question);
	public List<Question> getAllQuestions();

}
