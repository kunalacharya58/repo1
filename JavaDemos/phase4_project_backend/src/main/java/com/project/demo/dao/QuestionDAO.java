package com.project.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.model.Question;

@Repository
public interface QuestionDAO extends JpaRepository<Question, Integer>{

}
