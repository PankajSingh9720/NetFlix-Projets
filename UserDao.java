package com.jspider.netflix_servlet_projects.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jspider.netflix_servlet_projects.connection.NetflixConnection;
import com.jspider.netflix_servlet_projects.dto.User;

/**
 * 
 * @author {Pankaj Singh}
 *
 */
public class UserDao {
	private Connection connection = NetflixConnection.getNetflixConnection();

	private final String Insert_USER_QUERY = "insert into user(name,email,password,dob,phone,gender)values(?,?,?,?,?,?)";

	/**
	 * userRegistration method which help the programmer to register user and save
	 * his/her details for permanent inside mysql table
	 * 
	 * @param user
	 * @return
	 */
	public User userRegistrationDao(User user) {

		try {

			PreparedStatement ps = connection.prepareStatement(Insert_USER_QUERY);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setObject(4, user.getDob());
			ps.setLong(5, user.getPhone());
			ps.setString(6, user.getGender());
			ps.execute();

			return user;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	/**
	 * fetchUserByEmail for Login(06-05-2024)
	 */
	public User fetchUserByEmialDao(String userEmail) {

		try {
			PreparedStatement ps = connection.prepareStatement("FETCH_UESER_EMAIL_QUERY");
			ps.setString(1, "UserEmail");
			ps.setString(2, "userPassword");
			ResultSet rs = ps.executeQuery();
			rs.next();
			String email = rs.getString("Email");
			String password = rs.getString("password");
			return new User(email, password);

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

}
