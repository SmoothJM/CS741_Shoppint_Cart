package cart.pinfo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cart.backup.Service;
import cart.movie.Movie;
/*
 * This is the servlet class used to display the detail information of the selected movie by customer.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class MovieInformationServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mid = request.getParameter("mid");
		Service serviceMovieInfo = new Service();
		Movie movieInfoString=null;
		try {
			movieInfoString=serviceMovieInfo.findMovieInfo(mid);
		} catch (SQLException e) {
			response.getWriter().write("Database connected failed! Please contact officer: 608-667-6188");
		}
		request.setAttribute("movieInfoString", movieInfoString);
		request.getRequestDispatcher("/movieinfo.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}