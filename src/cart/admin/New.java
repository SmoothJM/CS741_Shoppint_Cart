package cart.admin;

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
 * This is a servlet class that used to show all information of items for administrator.
 * There is another servlet class has the same function. This is used to transfer to page in folder "WEB-INF".
 * In order to consider security, all the pages of managing are in folder "WEB-INF".
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class New extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Service findAll = new Service();
		List<Jersey> allJersey = null;
		List<Movie> allMovie = null;
		List<Shoes> allShoes = null;
		List<Poster> allPoster = null;
		try {
			allJersey = findAll.findJersey();
			allMovie = findAll.findMovie();
			allShoes = findAll.findShoes();
			allPoster = findAll.findPoster();
		} catch (SQLException e) {
			//e.printStackTrace();
			response.getWriter().write("Dial (608)667-6188, please.");
		}
		request.setAttribute("allJersey", allJersey);
		request.setAttribute("allMovie",allMovie);
		request.setAttribute("allShoes",allShoes);
		request.setAttribute("allPoster",allPoster);
		request.getRequestDispatcher("/WEB-INF/manage.jsp").forward(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}