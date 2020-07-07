package com.project.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.model.Feedback;

@Repository
public interface FeedbackDAO extends JpaRepository<Feedback, Integer> {
	
	public List<Feedback> findBySource(String source);
	public List<Feedback> findByUsername(String username);
	public List<Feedback> findByRating(int rating);
	
}
