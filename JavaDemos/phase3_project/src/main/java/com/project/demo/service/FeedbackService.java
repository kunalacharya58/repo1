package com.project.demo.service;

import java.util.List;

import com.project.demo.exceptions.BusinessException;
import com.project.demo.model.Feedback;

public interface FeedbackService {
	
	public Feedback createFeedback(Feedback feedback) throws BusinessException;
	public Feedback getFeedbackById(int id) throws BusinessException;
	public Feedback updateFeedback(Feedback feedback) throws BusinessException;
	public void deleteFeedback(int id) throws BusinessException;
	
	public List<Feedback> getAllFeedbacks();
	public List<Feedback> getFeedbacksBySource(String source);
	public List<Feedback> getFeedbacksByUsername(String username);
	public List<Feedback> getFeedbacksByRating(int rating);

}
