package com.ex.dao;
import java.util.ArrayList;

import com.ex.dto.*;

public interface BootDao {
	
	public abstract String insertBookDetails();
	public abstract String updateBookDetails(Book book);
	public abstract String deleteBookDetails(Book book);
	public abstract Book getBookDetails(Book book);
	public abstract ArrayList<Book> getAllBookDetails();

}
