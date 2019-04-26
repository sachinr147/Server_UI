package com.ex.daoimpl;

import java.util.ArrayList;

import com.ex.dao.FilterDao;
import com.ex.dto.Tracking;

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


public class FilterImpl implements FilterDao {

	@Override
	public String insertFilterDetails(String start, String end, String desc) {
		
		  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build(); 
	       Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	       String result;
	       SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	       Session session = factory.openSession();  
	       Transaction t = session.beginTransaction();  
	       try{
	    	   Tracking filter = new Tracking();
	       filter.setStartTime(start);
	       filter.setEndTime(end);
	       filter.setDescrip(desc);
	        
	      session.save(filter);  
	      t.commit();  
	      result = "{\"message\":\"successfully Registration\",\"success\":\"true\"}";
			}catch(Exception e){
				result ="{\"message\":\"Unsuccessfully Registration\",\"result\":\"Some Issue\",\"success\":\"false\"}" ;
			}finally{
				 factory.close();  
			     session.close();
			}
		return result;
		
	}

	@Override
	public String updateFilterDetails(Tracking filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteFilterDetails(Tracking filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFilterDetails(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Tracking> getAllFilterDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
