package com.model.bhaigym;

import java.sql.ResultSet;

public interface DAOServices {
	public void connectionDB();
	public void newRegistration(String name,String city,String email,String mobile);
	public ResultSet confirmRegistraion(String email);
	public boolean adminLogin(String email ,String password);
	public boolean userLogin(String id,String email);
	public ResultSet allRegistration();
	public void deleteRegistration(String email);
	public void updateRegistration(String email,String mobile);
	public ResultSet offer();
	public void insertOffer(String total,String offer,String email);
}
