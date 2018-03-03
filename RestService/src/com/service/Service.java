package com.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.beans.User;

@Path("/service")
public class Service {
	
	@GET
	public String Geet() {
		
User u = new User();
		
		u.setName("Aayushi");
		u.setAge(25);
		
		System.out.println("User-->" + u.toString());
	
		System.out.println("Hillo GET Method");
		return u.toString();
	}
	@POST
	@Path("/post")
	@Produces(MediaType.APPLICATION_JSON)
	public void Post() {
		
		User u = new User();
		
		u.setName("Aayushi");
		u.setAge(25);
		
		System.out.println("User-->" + u.toString());
	}

}
