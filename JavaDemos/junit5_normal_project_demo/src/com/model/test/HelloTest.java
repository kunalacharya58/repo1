package com.model.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.model.Hello;

public class HelloTest {
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("@BeforeAll");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("@BeforeEach");
	}
	
	@Test
	public void sayHelloTest() {
		System.out.println("@Test");
		Assertions.assertEquals("Hello JUnit5", new Hello().sayHello());
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("@AfterEach");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("@AfterAll");
	}
	

}
