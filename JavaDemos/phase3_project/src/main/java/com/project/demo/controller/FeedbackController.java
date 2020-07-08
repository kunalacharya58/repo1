package com.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.exceptions.BusinessException;
import com.project.demo.model.Feedback;
import com.project.demo.service.impl.FeedbackServiceImpl;

@RestController
public class FeedbackController {
	
	private MultiValueMap<String,String> map;

	@Autowired
	private FeedbackServiceImpl service;
	
	@PostMapping("/feedback")
	public ResponseEntity<Feedback> createFeedback(@RequestBody Feedback feedback) {
		try {
			return new ResponseEntity<Feedback>(service.createFeedback(feedback), HttpStatus.OK); 
		} catch (BusinessException e) {
			map = new LinkedMultiValueMap<>();
			map.add("message", e.getMessage());
			return new ResponseEntity<Feedback>(null, map, HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/feedback")
	public ResponseEntity<Feedback> updateFeedback(@RequestBody Feedback feedback) {
		try {
			return new ResponseEntity<Feedback>(service.updateFeedback(feedback), HttpStatus.OK); 
		} catch (BusinessException e) {
			map = new LinkedMultiValueMap<>();
			map.add("message", e.getMessage());
			return new ResponseEntity<Feedback>(null, map, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/feedback/{id}")
	public ResponseEntity<Feedback> getFeedbackById(@PathVariable("id") int id) {
		Feedback feedback = null;
		try {
			feedback = service.getFeedbackById(id);
			return new ResponseEntity<Feedback>(feedback, HttpStatus.OK); 
		} catch (BusinessException e) {
			map = new LinkedMultiValueMap<>();
			map.add("message", e.getMessage());
			return new ResponseEntity<Feedback>(null, map, HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/feedback/{id}")
	public ResponseEntity<Feedback> deleteFeedback(@PathVariable("id") int id) {
		try {
			service.deleteFeedback(id);
			return new ResponseEntity<Feedback>(HttpStatus.OK); 
		} catch (BusinessException e) {
			map = new LinkedMultiValueMap<>();
			map.add("message", e.getMessage());
			return new ResponseEntity<Feedback>(null, map, HttpStatus.NOT_FOUND);
		}
		
	}

	@GetMapping("/feedbacks")
	public List<Feedback> getAllFeedbacks() {
		return service.getAllFeedbacks();
	}

	@GetMapping("/feedbacks/source/{source}")
	public List<Feedback> getFeedbacksBySource(@PathVariable("source") String source) {
		return service.getFeedbacksBySource(source);
	}

	@GetMapping("/feedbacks/username/{username}")
	public List<Feedback> getFeedbacksByUsername(@PathVariable("username") String username) {
		return service.getFeedbacksByUsername(username);
	}

	@GetMapping("/feedbacks/rating/{rating}")
	public List<Feedback> getFeedbacksByRating(@PathVariable("rating") int rating) {
		return service.getFeedbacksByRating(rating);
	}

}
