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
/*
 * This is a servlet class used to add item into customers' cart.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class AddToCartServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("username");
		String itemname = request.getParameter("itemname");
		String itemtype = request.getParameter("type");
		float itemprice = Float.parseFloat(request.getParameter("price"));
		int itemquantity = Integer.parseInt(request.getParameter("quantity"));
		int itemid = Integer.parseInt(request.getParameter("id").trim());
		String image = request.getParameter("image");
		Service service = new Service();
		boolean flag=("").equals(username)||username==null;
		
			if (!flag) {
				Cart cart = new Cart(username, itemname, itemprice, itemquantity, itemtype,itemid,image);
				try {
					service.addItemToCart(cart);
					response.getWriter().write("Add successful!");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}else {
				response.getWriter().write("Log in First, please.");
				
				
				//GuestCart gc = new GuestCart(itemname, itemprice, itemquantity, itemtype, itemid, image);
//				try {
//					service.addItemToGuestCart(gc);
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}

				
			}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}