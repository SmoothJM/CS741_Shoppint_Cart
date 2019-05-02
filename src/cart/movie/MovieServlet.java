package cart.movie;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cart.backup.Service;
/*
 * This is a servlet class used to display all movie.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class MovieServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Service serviceMovie = new Service();
		List<Movie> movieList = null;
		try {
			movieList = serviceMovie.findMovie();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.getWriter().write("Call 608-667-6188 please.");
		}
		request.setAttribute("movieList", movieList);
		request.getRequestDispatcher("/movie.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}