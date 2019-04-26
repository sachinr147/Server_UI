package com.ex.dao;

import java.util.ArrayList;

import javax.ws.rs.FormParam;

import com.ex.dto.*;

public interface FilterDao {
	
	public abstract String insertFilterDetails(String start,String end,String desc);
	public abstract String updateFilterDetails(Tracking filter);
	public abstract String deleteFilterDetails(Tracking filter);
	public abstract String getFilterDetails(String id);
	public abstract ArrayList<Tracking> getAllFilterDetails();

}
