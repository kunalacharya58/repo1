package com.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.model.Result;
import com.project.demo.service.ResultService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ResultController {
	
	@Autowired
	private ResultService service;

	@PostMapping("/result")
	public Result storeResult(@RequestBody Result result) {
		return service.storeResult(result);
	}

	@GetMapping("/results")
	public List<Result> getAllResults() {
		return service.getAllResults();
	}

}
