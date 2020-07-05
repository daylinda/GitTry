package com.demo.model;

public class Hello {
	private String message;
	public Hello() {
		
		System.out.println("Hello from non param const");
		
	}
	public Hello(String message) {
		super();
		this.message = message;
		System.out.println("Hello from param const");
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
		System.out.println("hello from setter");
	}
	
	@Override
	public String toString() {
		return "Hello [message=" + message + "]";
	}
	

}
