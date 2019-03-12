package com.ex.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  

import java.util.ArrayList;

import com.ex.dao.BootDao;
import com.ex.dto.Book;

public class BookImpl implements BootDao {

	public String insertBookDetails() {
		// TODO Auto-generated method stub
		   StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build(); 
           Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
         
       SessionFactory factory = meta.getSessionFactoryBuilder().build();  
       Session session = factory.openSession();  
       Transaction t = session.beginTransaction();  
         
       Book b = new Book();
       b.setId(3);
       b.setName("SachinSahu");
       b.setPrice(3000);
        
      session.save(b);  
      t.commit();  
      System.out.println("successfully saved");    
       factory.close();  
       session.close();     
		return "successfully saved";
	}

	public String updateBookDetails(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteBookDetails(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	public Book getBookDetails(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Book> getAllBookDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
