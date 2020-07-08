package com.project.demo.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.project.demo.dao.FeedbackDAO;
import com.project.demo.exceptions.BusinessException;
import com.project.demo.model.Feedback;
import com.project.demo.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackDAO dao;
	
	private boolean validateFeedback(Feedback feedback) {
		boolean validTest = false;
		int stars = feedback.getRating();
		if (stars >= 1 && stars <= 5) {
			if (feedback.getSource() != null) {
				if (feedback.getUsername() != null) {
					validTest = true;
				}
			}
		}
		return validTest;
	}
	
	@Override
	public Feedback createFeedback(Feedback feedback) throws BusinessException {
		if (validateFeedback(feedback)) {			
			return dao.save(feedback);
		} else {
			throw new BusinessException("Invalid feedback, please check!");
		}
	}

	@Override
	public Feedback updateFeedback(Feedback feedback) throws BusinessException {
		if (validateFeedback(feedback)) {
			getFeedbackById(feedback.getId());
			return dao.save(feedback);
		} else {
			throw new BusinessException("Invalid feedback, please check!");
		}
	}
	
	@Override
	public Feedback getFeedbackById(int id) throws BusinessException {
		if (id <= 0) {
			throw new BusinessException("Incorrect ID");
		}
		Feedback feedback = null;
		try {			
			feedback = dao.findById(id).get();
		}
		catch (NoSuchElementException e) {
			throw new BusinessException("No Feedback Found For ID = "+id);
		}
		return feedback;
	}


	@Override
	public void deleteFeedback(int id) throws BusinessException {
		if (id <= 0) {
			throw new BusinessException("Incorrect ID");
		}
		try {			
			dao.deleteById(id);
		}
		catch (EmptyResultDataAccessException e) {
			throw new BusinessException("No Feedback Found For ID = "+id);
		}
	}

	@Override
	public List<Feedback> getAllFeedbacks() {
		return dao.findAll();
	}

	@Override
	public List<Feedback> getFeedbacksBySource(String source) {
		return dao.findBySource(source);
	}

	@Override
	public List<Feedback> getFeedbacksByUsername(String username) {
		return dao.findByUsername(username);
	}

	@Override
	public List<Feedback> getFeedbacksByRating(int rating) {
		return dao.findByRating(rating);
	}

}
