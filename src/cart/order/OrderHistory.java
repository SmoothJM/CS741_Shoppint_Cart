package cart.order;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cart.backup.Service;
/*
 * This is a servlet class used to display all history order.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */

public class OrderHistory extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Service service = new Service();
		List<Order> orderList = null;
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("username");
		try {
			orderList = service.findOrder(username);
		} catch (SQLException e) {
			response.getWriter().write("Call officer: 608-667-6188");
		}
		request.setAttribute("orderList", orderList);
		request.getRequestDispatcher("/orderhistory.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}