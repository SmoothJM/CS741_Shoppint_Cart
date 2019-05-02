package cart.admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cart.backup.Service;
/*
 * This is a servlet class that used to delete item by "id" and "type" form front-end.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class DeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dflag = request.getParameter("dflag");
		Service serviceDeleteItem = new Service();
		switch (dflag) {
		case "1":
			try {
				String jid = request.getParameter("did");
				serviceDeleteItem.deleteJersey(jid);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "2":
			try {
				String mid = request.getParameter("did");
				serviceDeleteItem.deleteMovie(mid);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "3":
			try {
				String pid = request.getParameter("did");
				serviceDeleteItem.deletePoster(pid);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "4":
			try {
				String sid = request.getParameter("did");
				serviceDeleteItem.deleteShoes(sid);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
		request.getRequestDispatcher("new").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}