package com.project.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.dao.ResultDAO;
import com.project.demo.model.Result;
import com.project.demo.service.ResultService;

@Service
public class ResultServiceImpl implements ResultService {
	
	@Autowired
	private ResultDAO dao;

	@Override
	public Result storeResult(Result result) {
		return dao.save(result);
	}

	@Override
	public List<Result> getAllResults() {
		return dao.findAll();
	}

}
