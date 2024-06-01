package com.jspider.netflix_servlet_projects.controller;

/**
 * @author {Pankaj Singh}
 *
 */

	import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspider.netflix_servlet_projects.dao.MovieDao;
import com.jspider.netflix_servlet_projects.dto.Movie;

	@WebServlet(value = "/searchMovie")
	public class MovieSearchController  extends HttpServlet{

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			MovieDao dao = new MovieDao();
			
			String movieSearch = req.getParameter("search");
			
			List<Movie> movies = dao.getSpecificTypeMovieDetails(movieSearch);
			
			req.setAttribute("movieSearch", movieSearch);
			
			req.setAttribute("movieDetails", movies);
			
			req.getRequestDispatcher("genres-movie.jsp").forward(req, resp);
			
		}
	}


