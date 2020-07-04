package com.soapservice.impl;

import javax.jws.WebService;

import com.soapservice.CalculatorService;

@WebService(endpointInterface = "com.soapservice.CalculatorService")
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public String sayHello() {
		
		return "hello service with jax-ws";
	}

	@Override
	public String sayHelloByName(String name) {
		// TODO Auto-generated method stub
		return "hello "+name+" to service";
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
