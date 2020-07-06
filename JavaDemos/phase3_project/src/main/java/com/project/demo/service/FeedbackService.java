package com.project.demo.service;

import java.util.List;

import com.project.demo.model.Feedback;

public interface FeedbackService {
	
	public Feedback createFeedback(Feedback feedback);
	public Feedback getFeedbackById(int id);
	public Feedback updateFeedback(Feedback feedback);
	public void deleteFeedback(int id);
	public List<Feedback> getAllFeedbacks();

}
