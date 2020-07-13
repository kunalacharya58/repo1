package com.project.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.demo.model.Result;

@Service
public interface ResultService {
	
	public Result storeResult(Result result);
	public List<Result> getAllResults();

}
