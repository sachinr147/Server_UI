package com.ex.dao;
import java.util.ArrayList;

import javax.ws.rs.FormParam;

import com.ex.dto.*;

public interface AuthenticationDao {
	
	public abstract String insertUserDetails(String confirmPassword,String email,String fullName,String password);
	public abstract String updateUserDetails(User book);
	public abstract String deleteUserDetails(User book);
	public abstract String getUserDetails(String email,String password);
	public abstract ArrayList<User> getAllUserDetails();

}
