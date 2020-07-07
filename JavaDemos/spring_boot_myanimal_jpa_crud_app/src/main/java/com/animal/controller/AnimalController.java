package com.animal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.animal.model.Animal;
import com.animal.service.AnimalService;

@RestController
public class AnimalController{
	
	@Autowired
	private AnimalService service;

	@PostMapping("/animal")
	public Animal createAnimal(@RequestBody Animal animal) {
		return service.createAnimal(animal);
	}

	@PutMapping("/animal")
	public Animal updateAnimal(@RequestBody Animal animal) {
		return service.updateAnimal(animal);
	}

	@GetMapping("/animal/{id}")
	public Animal getAnimalById(@PathVariable("id") int id) {
		return service.getAnimalById(id);
	}

	@GetMapping("/animals")
	public List<Animal> getAnimals() {
		return service.getAnimals();
	}

	@GetMapping("/animals/age/{age}")
	public List<Animal> getAnimalsByAge(@PathVariable("age") int age) {	
		return service.getAnimalsByAge(age);
	}

	@GetMapping("/animals/category/{category}")
	public List<Animal> getAnimalsByCategory(@PathVariable("category") String category) {
		return service.getAnimalsByCategory(category);
	}

	@DeleteMapping("/animal/{id}")
	public void deleteAnimalById(@PathVariable("id") int id) {
		service.deleteAnimalById(id);
	}
	
}
