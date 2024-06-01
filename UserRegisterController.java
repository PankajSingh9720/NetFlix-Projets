package com.jspider.netflix_servlet_projects.controller;
import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.jspider.netflix_servlet_projects.dto.User;
import com.jspider.netflix_servlet_projects.service.UserService;
import com.jspider.netflix_servlet_projects.verifcation.EmailPasswordVerification;
/**
 * @author Pankaj Singh
 */
@WebServlet(value= "/userLogin")
public class UserRegisterController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserService service = new UserService();
		
		String name=req.getParameter("name");
		String email=   EmailPasswordVerification.emailVerification(req.getParameter("email"));
		String password= EmailPasswordVerification.passwordVerification(req.getParameter("password"));
		String gender =req.getParameter("gender");
		LocalDate date=LocalDate.parse(req.getParameter("dob"));
		Part image =req.getPart("image");
		long phone =Long.parseLong(req.getParameter("phone"));
		
		
		if((email!=null)&&(password!=null)) {
			User user = new User(name,email,password,date,phone,gender);
			service.userRegistrationService(user);
			req.getRequestDispatcher("user-login.jsp").forward(req,resp);
			
		}
		else {
			
			req.setAttribute("userMsg"," email must cotain @. and number (abc123@gmail.com)");
			req.setAttribute("userPass"," password must contain any one special character , number,aphabet one upper character ");
			req.getRequestDispatcher("user-registration.jsp").forward(req,resp);
		}
		
		//service.userRegistrationService(null);
		
		
	}
}