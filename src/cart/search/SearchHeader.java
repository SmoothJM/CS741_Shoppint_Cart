package cart.search;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cart.backup.Service;
import cart.jersey.Jersey;
import cart.movie.Movie;
import cart.poster.Poster;
import cart.shoes.Shoes;
/*
 * This is the servlet class to search item fuzzily.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class SearchHeader extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("mainSearch");
		String type="";
		Service findAll = new Service();
		List<Jersey> allJersey = null;
		List<Movie> allMovie = null;
		List<Shoes> allShoes = null;
		List<Poster> allPoster = null;
		try {
			allJersey = findAll.searchJerseyFuzzily(name, type);
			allMovie = findAll.searchMovieFuzzily(name, type);
			allShoes = findAll.searchShoesFuzzily(name, type);
			allPoster = findAll.searchPosterFuzzily(name, type);
		} catch (SQLException e) {
			response.getWriter().write("Dial (608)667-6188, please.");
		}
		request.setAttribute("allJersey", allJersey);
		request.setAttribute("allMovie",allMovie);
		request.setAttribute("allShoes",allShoes);
		request.setAttribute("allPoster",allPoster);
		request.getRequestDispatcher("/search.jsp").forward(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}