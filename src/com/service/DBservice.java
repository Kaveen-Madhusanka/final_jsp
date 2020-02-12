package com.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBservice {
	
	public static Connection conn = null;
	public static Connection getDBConnection() {
		
		String URL,USERNAME,PASSWORD; 
		//register driver class
		try {
			Class.forName("com.mysql.jdbc.Driver");
			URL="jdbc:mysql://localhost:3306/results";
			USERNAME="root";
			PASSWORD="";
			conn=DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			System.out.println("something went wrong");
		}
		
		return conn;
	}

}
