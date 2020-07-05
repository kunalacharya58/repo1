package com.demo.model;

public class HelloLifeCycle {
	
	private String message;
	
	public HelloLifeCycle() {
		// TODO Auto-generated constructor stub
	}

	public HelloLifeCycle(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Bean is alive");
	}
	
	public void destroy() {
		System.out.println("Killing the Bean");
	}

}
