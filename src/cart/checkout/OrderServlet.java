package cart.checkout;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cart.backup.Service;
import cart.person.User;
/*
 * This is a servlet class used to display users' information in checkout process.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class OrderServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Service service = new Service();
		String username = (String)session.getAttribute("username");
		List<Cart> cartList = new ArrayList<Cart>();
		User user = new User();
		try {
			cartList=service.showCart(username);
			user=service.userInfo(username);
			request.setAttribute("cartList", cartList);
			request.setAttribute("user", user);
			request.getRequestDispatcher("/order.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}