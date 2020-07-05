package com.demo.model;

public class Hello {
	
	private String message;
	
	public Hello() {
		// TODO Auto-generated constructor stub
	}

	public Hello(String message) {
		super();
		this.message = message;
		System.out.println(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Hello [message=" + message + "]";
	}

}
