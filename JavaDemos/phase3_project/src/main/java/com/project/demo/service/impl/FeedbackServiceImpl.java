package com.project.demo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.project.demo.model.Feedback;
import com.project.demo.service.FeedbackService;

@Component
public class FeedbackServiceImpl implements FeedbackService {

	public static Map<Integer, Feedback> db = new HashMap<>();
	public static int count = 0;
	
	@Override
	public Feedback createFeedback(Feedback feedback) {
		feedback.setId(++count);
		db.put(feedback.getId(), feedback);
		return feedback;
	}

	@Override
	public Feedback getFeedbackById(int id) {
		return db.get(id);
	}

	@Override
	public Feedback updateFeedback(Feedback feedback) {
		db.put(feedback.getId(), feedback);
		return db.get(feedback.getId());
	}

	@Override
	public void deleteFeedback(int id) {
		db.remove(id);
	}

	@Override
	public List<Feedback> getAllFeedbacks() {
		return new ArrayList<>(db.values());
	}

}
