package com.ex.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import com.ex.dao.AuthenticationDao;
import com.ex.dto.User;

public class AuthenticationImpl implements AuthenticationDao {

	public String insertUserDetails(String confirmPassword,String email,String fullName,String password) {
		// TODO Auto-generated method stub
		
	   StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build(); 
       Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
       long id ;
       String result =null;
       SessionFactory factory = meta.getSessionFactoryBuilder().build();  
       Session session = factory.openSession();  
       Transaction t = session.beginTransaction();  
       try{
       User user = new User();
       user.setEmail(email);
       user.setFullName(fullName);
       user.setPassword(password);
       user.setConfirmPassword(confirmPassword);
        
      session.save(user);  
      id =  user.getId();
      t.commit();  
      result = "{\"message\":\"successfully Registration\",\"result\":"+id+",\"success\":\"true\"}";
		}catch(Exception e){
			result ="{\"message\":\"Unsuccessfully Registration\",\"result\":\"Some Issue\",\"success\":\"false\"}" ;
		}finally{
			 factory.close();  
		     session.close();
		}
	return result;
		
	}

	public String updateUserDetails(User book) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteUserDetails(User book) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUserDetails(String email,String password) {
	
		// TODO Auto-generated method stub
		
		
		   StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build(); 
	       Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	       String result =null;
	       SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	       Session session = factory.openSession(); 
	       long id ;
	       try{
	    	
	    	   Query query = session.createQuery("FROM User WHERE email=:email AND password=:password"); 
	    	   query.setParameter("email", email);
	    	   query.setParameter("password", password);
	    	   List list = query.list();
	    	   Iterator iterator = list.iterator();
	    	     if(iterator.hasNext()) {
	    	        User user = (User) iterator.next();
	    	        id =  user.getId();
	    	        
	    	         result = "{\"message\":\"successfully Login\",\"result\":"+id+",\"success\":\"true\"}";
	    	      }else{
	    	    	  result ="{\"message\":\"Unsuccessfully Login\",\"result\":\"Some Issue\",\"success\":\"false\"}" ;
	    	      }
   
			}catch(Exception e){
			}finally{
				 factory.close();  
			     session.close();
			}
		return result;
		
		
	}

	public ArrayList<User> getAllUserDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
