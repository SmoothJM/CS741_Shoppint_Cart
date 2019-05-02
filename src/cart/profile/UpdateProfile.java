package cart.profile;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cart.backup.Service;
import cart.person.User;
/*
 * This is the servlet class to update current customer when click the top right link which is user's name.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class UpdateProfile extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String sstate = request.getParameter("sstate");
		String scity = request.getParameter("scity");
		String sstreet = request.getParameter("sstreet");
		String bstate = request.getParameter("bstate");
		String bcity = request.getParameter("bcity");
		String bstreet = request.getParameter("bstreet");
		String card = request.getParameter("cardreal");
		User user = new User(firstname, lastname, email, tel, sstate, scity, sstreet, bstate, bcity, bstreet,username,card);
		Service service = new Service();
		try {
			service.updateCustomerInfo(user);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}