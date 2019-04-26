package com.example.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import com.ex.dao.AuthenticationDao;
import com.ex.dao.FilterDao;
import com.ex.daoimpl.AuthenticationImpl;
import com.ex.daoimpl.FilterImpl;



@Path("/authentication")
public class Example {

	@POST
	@Path("/registration")
	@Consumes("application/x-www-form-urlencoded")
	public String registration(@FormParam("confirmPassword") String confirmPassword,@FormParam("email") String email,@FormParam("fullName") String fullName,@FormParam("password") String password) {
		AuthenticationDao bd = new AuthenticationImpl();
		String result = bd.insertUserDetails(confirmPassword,email,fullName,password);
		return result;
		
	}
	
	@POST
	@Path("/login")
	@Consumes("application/x-www-form-urlencoded")
	public String login(@FormParam("email") String email,@FormParam("password") String password) {
		AuthenticationDao bd = new AuthenticationImpl();
		String result = bd.getUserDetails(email,password);
		return result;
		
	}
	
	@POST
	@Path("/savefilter")
	@Consumes("application/x-www-form-urlencoded")
	public String saveFilter(@FormParam("start") String start,@FormParam("end") String end,@FormParam("desc") String desc) {
		FilterDao fd = new FilterImpl();
		String result =fd.insertFilterDetails(start, end, desc);
		return result;
		
	}
	
	@POST
	@Path("/getallfilter")
	@Consumes("application/x-www-form-urlencoded")
	public String getAllFilter(@FormParam("id") String start) {
		
		return "";
		
	}
	

}
