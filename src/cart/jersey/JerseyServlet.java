package cart.jersey;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cart.backup.Service;
/*
 * This is a servlet class used to display all jersey.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class JerseyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Service serviceJersey = new Service();
		List<Jersey> jerseyList = null;
		
		try {
			jerseyList = serviceJersey.findJersey();
		} catch (SQLException e) {
			e.printStackTrace();
			//response.getWriter().write("Database connected failed! Please contact officer: 608-667-6188");
		}
		
		request.setAttribute("jerseyList", jerseyList);
		request.getRequestDispatcher("/jersey.jsp").forward(request, response);
	}

	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}