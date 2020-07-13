package com.project.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.model.Result;

@Repository
public interface ResultDAO extends JpaRepository<Result, Integer>{

}
