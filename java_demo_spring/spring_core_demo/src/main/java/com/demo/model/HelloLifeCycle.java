package com.demo.model;

public class HelloLifeCycle {
	private String message;
	public HelloLifeCycle() {
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HelloLifeCycle(String message) {
		super();
		this.message = message;
	}
	
	public void init() {
		
		System.out.println("bean is in init()"); 
		
	}
	
	public void destroy() {
		
		System.out.println("bean is in destroy()");
		
	}

}
