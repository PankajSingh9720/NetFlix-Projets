package com.jspider.netflix_servlet_projects.service;

import com.jspider.netflix_servlet_projects.dao.UserDao;
import com.jspider.netflix_servlet_projects.dto.User;
import com.jspider.netflix_servlet_projects.verifcation.EmailPasswordVerification;

/**
 * @author {Pankaj Singh}
 *
 */
public class UserService {

	UserDao dao = new UserDao();

	public User userRegistrationService(User user) {

		String email = EmailPasswordVerification.emailVerification(user.getEmail());
		String password = EmailPasswordVerification.passwordVerification(user.getPassword());

		if ((email != null) && (password != null)) {

			return dao.userRegistrationDao(user);
		} else {
			return null;

		}

	}

}
