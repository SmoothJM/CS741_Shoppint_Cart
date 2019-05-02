package cart.pinfo;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cart.backup.Service;
import cart.poster.Poster;
/*
 * This is the servlet class used to display the detail information of the selected poster by customer.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class PosterInformationServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid = request.getParameter("pid");
		Service servicePosterInfo = new Service();
		Poster posterInfoString=null;
		try {
			posterInfoString=servicePosterInfo.findPosterInfo(pid);
		} catch (SQLException e) {
			response.getWriter().write("Database connected failed! Please contact officer: 608-667-6188");
		}
		request.setAttribute("posterInfoString", posterInfoString);
		request.getRequestDispatcher("/posterinfo.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}