package cart.checkout;

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
 * This is a servlet class used to display all items which have already add into personal cart.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class CartServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Service service = new Service();
		String username = (String)session.getAttribute("username");
		boolean flag = ("").equals(username)||username==null;
		if(!flag){
			try {
				List<Cart> cartList = service.showCart(username);
				request.setAttribute("cartList", cartList);
				request.getRequestDispatcher("/cart.jsp").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else{
			try {
				List<GuestCart> cartList = service.showGuestCart();
				request.setAttribute("cartList", cartList);
				request.getRequestDispatcher("/cart.jsp").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}