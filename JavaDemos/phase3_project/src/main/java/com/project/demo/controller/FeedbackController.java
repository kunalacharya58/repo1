package com.project.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.model.Feedback;
import com.project.demo.service.FeedbackService;
import com.project.demo.service.impl.FeedbackServiceImpl;

@RestController
public class FeedbackController implements FeedbackService {

	private FeedbackServiceImpl service = new FeedbackServiceImpl();
	
	@PostMapping("/feedback")
	public Feedback createFeedback(@RequestBody Feedback feedback) {
		return service.createFeedback(feedback);
	}

	@GetMapping("/feedback/{id}")
	public Feedback getFeedbackById(@PathVariable("id") int id) {
		return service.getFeedbackById(id);
	}

	@PutMapping("/feedback")
	public Feedback updateFeedback(@RequestBody Feedback feedback) {
		return service.updateFeedback(feedback);
	}

	@DeleteMapping("/feedback/{id}")
	public void deleteFeedback(@PathVariable("id") int id) {
		service.deleteFeedback(id);
	}

	@GetMapping("/feedbacks")
	public List<Feedback> getAllFeedbacks() {
		return service.getAllFeedbacks();
	}

}
