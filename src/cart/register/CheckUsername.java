package cart.register;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cart.backup.Service;
/*
 * This is the servlet class to check whether the user name is duplicated.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class CheckUsername extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Service checkUsernameService = new Service();
		String username = request.getParameter("user");
		System.out.println(username);
		boolean result = false;
		
		/*try {
			result = checkUsernameService.checkUsername(username);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (result) {
			response.getWriter().write("yes");
		}
		else{
			response.getWriter().write("no");
		}*/
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}