package com.hello;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class HelloRest {
	
	@GET	
	public String sayHelloGet() {
		return "Hello Welcome to JAX-RS with Jersey API GET";
	}
	
	
	@Path("/{name}")
	@GET
	public String sayHelloGet(@PathParam("name")String name) {
		return "Hello "+name + " Welcome to JAX-RS with Jersey API GET";
	}
	
	@POST
	public String sayHelloPost() {
		return "Hello Welcome to JAX-RS with Jersey API POST";
	}


	@PUT
	public String sayHelloPut() {
		return "Hello Welcome to JAX-RS with Jersey API PUT";
	}
	
	@DELETE
	public String sayHelloDelete() {
		return "Hello Welcome to JAX-RS with Jersey API DELETE";
	}


	
	
	
}
