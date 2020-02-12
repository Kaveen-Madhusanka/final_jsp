package com.service;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Login_service {
	
	public static String AuthenticateUser( String username,String password) {
		String msg = null;
		String query;
		query = "select pasword from login where username=?";
		try {
			PreparedStatement pst =DBservice.getDBConnection().prepareStatement(query);
			pst.setString(1, username);
			ResultSet rs=pst.executeQuery();
			
			if (rs.next()) {
				if (rs.getString(1).equals(password)) {
					msg="Sucsess";
					
				}else {
					msg="invalid credentials";
				}
				
			}else {
				msg="invalid credentials";
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return msg;
		
	}

}
