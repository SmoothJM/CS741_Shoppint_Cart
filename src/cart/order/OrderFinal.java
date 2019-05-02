package cart.order;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cart.backup.Service;
/*
 * This is a servlet class used to generate order.
 * In other word, this is the final process of checkout.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class OrderFinal extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Service service = new Service();
		Date currentTime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String createdate = sdf.format(currentTime);
		String user = (String)session.getAttribute("username");
		String totalPrice = request.getParameter("totalFinal");
		List<String> li = new ArrayList<String>();
		try {
			li = service.findItemName(user);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String itemname = li.toString();
		
		Order order = new Order(user, totalPrice, createdate,itemname);
		try {
			
			service.addOrder(order);
			service.deleteItemAfterCheckout(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("/TheEnd.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}