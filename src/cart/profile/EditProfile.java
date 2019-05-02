package cart.profile;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cart.backup.Service;
import cart.person.User;
/*
 * This is the servlet class to display current customer profile.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class EditProfile extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		Service userInfoService = new Service();
		try {
			User userInfo = userInfoService.userInfo(username);
			request.setAttribute("userInfo", userInfo);
			request.getRequestDispatcher("/customerProfile.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}