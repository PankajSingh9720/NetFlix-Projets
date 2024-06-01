package com.jspider.netflix_servlet_projects.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jspider.netflix_servlet_projects.connection.NetflixConnection;
import com.jspider.netflix_servlet_projects.dto.Admin;

/*
 * Pankaj Singh
 */
public class AdminDao {
	private Connection connection = NetflixConnection.getNetflixConnection();
	
	/*  database Queries
	 *  @ return admin
	 */
private final String SELECT_QUERY_FOR_LOGIN = " SELECT email,password FROM admin WHERE email = ? ";

	/*
	 * create a fetchAdminByEmailForLoginDao() method 
	 */
	
	public Admin fetchAdminByEmailForLoginDao(String adminEmail) {
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY_FOR_LOGIN);
			
			preparedStatement.setString(1, adminEmail);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			String email=resultSet.getString("email");
			String password = resultSet.getString("password");
			
		     return new Admin(email,password);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
			
		}
		
		
	}
}
