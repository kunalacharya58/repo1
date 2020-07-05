package com.validation.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.validation.Validation;

public class ValidationTest {
	
	private static Validation validator;
	
	@BeforeAll
	public static void beginAll() {
		validator = new Validation();
	}
	
	@Test
	public void testPanTrue() {
		Assertions.assertTrue(validator.validatePan("AAAAA1111A"));
	}
	
	@Test
	public void testPanFalse() {
		Assertions.assertFalse(validator.validatePan("AAA111111A"));
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("Done");
	}

}
