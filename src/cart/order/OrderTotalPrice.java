package cart.order;

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
import cart.checkout.Cart;
import cart.person.User;
import cart.tax.Tax;
/*
 * This is a servlet class used to display the final price which include tax and discount if it has.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class OrderTotalPrice extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Service service = new Service();
		String username = (String)session.getAttribute("username");
		List<Cart> cartList = new ArrayList<Cart>();
		User user = new User();
		String taxRate="";
		String state="";
		Tax tax = new Tax();
		
		try {
			cartList=service.showCart(username);
			user=service.userInfo(username);
			state = user.getBillingstate();
			tax = service.findTaxRate(state);
			//taxRate = tax.getTax();
			//System.out.println(tax);
			//System.out.println(state);
			request.setAttribute("cartList", cartList);
			request.setAttribute("user", user);
			request.setAttribute("taxRate", taxRate);
			request.setAttribute("tax", tax);
			request.getRequestDispatcher("/totalPrice.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}