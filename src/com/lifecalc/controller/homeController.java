package com.lifecalc.controller;

import java.util.Date;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lifecalc.model.user;

// http://www.mkyong.com/webservices/jax-rs/json-example-with-jersey-jackson/

@Path("/test")
public class homeController {

	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/users")
	public user getShowUser() 
	{
		System.out.println("passou::");
		
		user usuario = new user();
		
		usuario.setName("Miguel Carvalho");
		usuario.setEmail("migmig@test.com");
		usuario.setSexo("M");
		usuario.setIdade("2");
		usuario.setDescricao("User network");
		//usuario.setDataNasc(new Date("17092015"));		
		
		return usuario;
		
		
	}
}
