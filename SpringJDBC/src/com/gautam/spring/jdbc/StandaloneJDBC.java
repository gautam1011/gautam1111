package com.gautam.spring.jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StandaloneJDBC {

	
	private final static String DATABASE_USER="dbuser";
	private final static String DATABASE_PASSWORD="dbpassword";
	private final static String  DATABASE_URL="jdbc:postgresql://192.168.1.53:5432/bellinfodevdb";
	private final static String DATABASE_DRIVER_CLASS="org.postgresql.Driver";
	public static void main(String[] args) {
		
		Connection connection=null;
		try
		{
			Class.forName(DATABASE_DRIVER_CLASS);
			
			connection =DriverManager.getConnection(DATABASE_URL,DATABASE_USER,DATABASE_PASSWORD);
			java.sql.Statement statement =connection.createStatement();
			
			String Query ="SELECT * FROM NEWS";
			ResultSet result =statement.executeQuery(Query);
			
			while(result.next())
			{
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("sticker symbol" +result.getString(1));
				System.out.println("headlines" +result.getString(2));
				
				System.out.println("main story" +result.getString(3));
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
			
		}
		finally{
			try{
				connection.close();
			}
			catch(SQLException e){
				
			
			e.printStackTrace();
		}
		

	}

	}
}
