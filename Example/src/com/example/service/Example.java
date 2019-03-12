package com.example.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.ex.dao.BootDao;
import com.ex.daoimpl.BookImpl;

import javax.ws.rs.Produces;


@Path("/exeample")
public class Example {

	@Path("/res")
	@GET
	@Produces("text/html")
	public String exampleRun() {
		//BootDao bd = new BookImpl();
		//String sb = bd.insertBookDetails();
		return "{\"message\":\"hello\"}";
	}
	

}
