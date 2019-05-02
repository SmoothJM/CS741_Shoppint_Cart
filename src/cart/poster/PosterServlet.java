package cart.poster;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cart.backup.Service;
/*
 * This is the servlet class to display all poster.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class PosterServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Service servicePoster = new Service();
		List<Poster> posterList = null;
		try {
			 posterList = servicePoster.findPoster();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			response.getWriter().write("Call officer: 608-667-6188");
		}
		request.setAttribute("posterList", posterList);
		request.getRequestDispatcher("/poster.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}