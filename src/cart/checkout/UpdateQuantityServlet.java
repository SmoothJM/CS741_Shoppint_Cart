package cart.checkout;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cart.backup.Service;
/*
 * This is a servlet class used to change the item info in cart, such as quantity, subtotal.
 * The front page call this servlet by AJAX.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class UpdateQuantityServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("idreal");
		//System.out.println(id);
		//System.out.println(request.getParameter("quantityreal"));
		//System.out.println(request.getParameter("test"));
		int quantity = Integer.parseInt(request.getParameter("quantityreal"));
		float subtotal = Float.parseFloat(request.getParameter("subtotal"));
		Service service = new Service();
		DecimalFormat df = new DecimalFormat("#.00");
		String finalSubtotal = df.format(subtotal);
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("username");
		
		boolean flag=("").equals(username)||username==null;
		if (!flag) {
			try {
				service.updateItemQuantityFromCart(id, quantity,finalSubtotal);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else{
			try {
				service.updateItemQuantityFromGuestCart(id, quantity);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}