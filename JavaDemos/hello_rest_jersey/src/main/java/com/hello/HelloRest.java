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
		return "Hello from GET";
	}
	
//	@Path("/{name}")
//	@GET
//	public String sayHelloGet(@PathParam("name")String name) {
//		return "Hello from GET "+name+";";
//	}
	
//	@Path("/{num1}/{num2}")
//	@GET
//	public String sayHelloGet(@PathParam("num1") int num1, @PathParam("num2") int num2) {
//		return "Hello from GET "+num1+" x "+num2+" = "+(num1*num2);
//	}
	
	@Path("/{name}/{id}")
	@GET
	public String sayHelloGet(@PathParam("name") String name, @PathParam("id") int id) {
		return "Hello from GET | Your name is "+name+" and your ID ="+id;
	}
	
	@POST
	public String sayHelloPost() {
		return "Hello from POST";
	}
	
	@PUT
	public String sayHelloPut() {
		return "Hello from PUT";
	}
	
	@DELETE
	public String sayHelloDelete() {
		return "Hello from DELETE";
	}

}
