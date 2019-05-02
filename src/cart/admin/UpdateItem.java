/*
 * Display information of item needs to update. DB operation is in "UpdateItemDao" 
 */

package cart.admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cart.backup.Service;
import cart.jersey.Jersey;
import cart.movie.Movie;
import cart.poster.Poster;
import cart.shoes.Shoes;
/*
 * This is a servlet class that used to update info of items by admin.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class UpdateItem extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uflag = request.getParameter("uflag");
		String uid = request.getParameter("uid");
		Service updateItemService = new Service();
		
		switch (uflag) {
		case "1":
			try {
				Jersey jerseyUpdate = new Jersey();
				jerseyUpdate = updateItemService.findJerseyInfo(uid);
				request.setAttribute("update", jerseyUpdate);
				request.getRequestDispatcher("/WEB-INF/updateItem.jsp").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "2":
			try {
				Movie movieUpdate = new Movie();
				movieUpdate = updateItemService.findMovieInfo(uid);
				request.setAttribute("update", movieUpdate);
				request.getRequestDispatcher("/WEB-INF/updateItem.jsp").forward(request, response);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			break;
		case "3":
			try {
				Poster posterUpdate = new Poster();
				posterUpdate = updateItemService.findPosterInfo(uid);
				request.setAttribute("update", posterUpdate);
				request.getRequestDispatcher("/WEB-INF/updateItem.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "4":
			try {
				Shoes shoesUpdate = new Shoes();
				shoesUpdate = updateItemService.findShoesInfo(uid);
				request.setAttribute("update", shoesUpdate);
				request.getRequestDispatcher("/WEB-INF/updateItem.jsp").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}