package com.soapservice.publisher;

import java.net.MalformedURLException;
import java.net.URL;

//import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;

import com.soapservice.impl.CalculatorServiceImpl;

public class Publisher {
	
	public static void main(String[] args) {
		String endpoint = "http://localhost:9020/calci?wsdl";
				
		Endpoint.publish(endpoint, new CalculatorServiceImpl());
		
		System.out.println("Soap Service publishe at " + endpoint);
	}

}
