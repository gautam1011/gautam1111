package com.gautam.spring.jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataServiceImpl implements DataService {
	
	private  String DATABASE_USER;
	private  String DATABASE_PASSWORD;
	private  String DATABASE_URL;
	private  String DATABASE_DRIVER;
	
	
	public String getDATABASE_USER() {
		return DATABASE_USER;
	}


	public void setDATABASE_USER(String dATABASE_USER) {
		DATABASE_USER = dATABASE_USER;
	}


	public String getDATABASE_PASSWORD() {
		return DATABASE_PASSWORD;
	}


	public void setDATABASE_PASSWORD(String dATABASE_PASSWORD) {
		DATABASE_PASSWORD = dATABASE_PASSWORD;
	}


	public String getDATABASE_URL() {
		return DATABASE_URL;
	}


	public void setDATABASE_URL(String dATABASE_URL) {
		DATABASE_URL = dATABASE_URL;
	}


	public String getDATABASE_DRIVER() {
		return DATABASE_DRIVER;
	}


	public void setDATABASE_DRIVER(String dATABASE_DRIVER) {
		DATABASE_DRIVER = dATABASE_DRIVER;
	}


	public void PrintNews()
	{
		Connection connection =null;
		try
		{
			Class.forName(DATABASE_DRIVER);
			
			connection =DriverManager.getConnection(DATABASE_URL,DATABASE_USER,DATABASE_PASSWORD);
			
		java.sql.Statement statement =connection.createStatement();
		ResultSet rs=statement.executeQuery("SELECT * FROM NEWS");
		
		while(rs.next())
		{
			System.out.println(rs.getString(2));
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
		}
		
			
		}catch(Exception ex){
		ex.printStackTrace();
		
	}
	
	finally{
		try{
			connection.close();
			
			
			
			
			
			
			
			
		}catch(SQLException e){
		e.printStackTrace();
		}
	}

	}
}
