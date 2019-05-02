package cart.checkout;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cart.backup.Service;
/*
 * This is a servlet class used to delete item from cart (guest).
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class DeleteGuestItemServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Service service = new Service();
		try {
			service.deleteItemFromGuestCart(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("cartservlet").forward(request, response);
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}