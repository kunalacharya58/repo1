package com.project.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.dao.QuestionDAO;
import com.project.demo.model.Question;
import com.project.demo.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionDAO dao;

	@Override
	public Question createQuestion(Question question) {
		return dao.save(question);
	}

	@Override
	public List<Question> getAllQuestions() {
		return dao.findAll();
	}

}
