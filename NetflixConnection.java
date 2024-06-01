package com.jspider.netflix_servlet_projects.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * @author {Pankaj Singh}
 *
 */
public class NetflixConnection {
	/*
	 * Create a Connection
	 */
	public static Connection getNetflixConnection() {

		try {
			/*
			 * 1st step Load the Driver
			 */
			Class.forName("com.mysql.cj.jdbc.Driver");
			/*
			 * 2st step  Create the connection with url,user,password
			 */
			String url = "jdbc:mysql://localhost:3306/netflix";
			String user = "root";
			String pass = "root";

			return DriverManager.getConnection(url, user, pass);

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}

	}

}
