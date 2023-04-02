package com.model.bhaigym;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOServiceImpl implements DAOServices {
	private Connection con;
	private Statement stmt;
	@Override
  public void connectionDB() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhaigymregistration","root","test");
		stmt=con.createStatement();
		System.out.println(con);
	}catch(Exception e) {
		e.printStackTrace();
	}
  }
	@Override
	public void newRegistration(String name,String city,String email,String mobile) {
		try {
			stmt.executeUpdate("insert into registration (name,city,email,mobile) values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public boolean adminLogin(String email, String password) {
		try {
			ResultSet result = stmt.executeQuery("select * from adminLogin where email='"+email+"'and password='"+password+"'");
			return result.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public void deleteRegistration(String email) {
		try {
			stmt.executeUpdate("delete from registration where email='"+email+"'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void updateRegistration(String email, String mobile) {
		try {
			stmt.executeUpdate("update registration set mobile='"+mobile+"' where email='"+email+"'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public ResultSet allRegistration() {
		try {
			ResultSet rs = stmt.executeQuery("select * from registration");
			return rs;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public boolean userLogin(String id, String email) {
		try {
			ResultSet result = stmt.executeQuery("select id,email from registration where id='"+id+"' and email='"+email+"'");
			return result.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public ResultSet confirmRegistraion(String email) {
		try {
			ResultSet result = stmt.executeQuery("Select * from registration where email='"+email+"'");
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public ResultSet offer() {
		try {
			ResultSet result = stmt.executeQuery("select *from offer where id=(select Max(id) from offer)");
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public void insertOffer(String total, String offer, String email) {
     try {
		stmt.executeUpdate("insert into offer (total,offer,email) values('"+total+"','"+offer+"','"+email+"')");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
}
