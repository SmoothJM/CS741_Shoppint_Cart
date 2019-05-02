package cart.admin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.concurrent.ManageableThread;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cart.jersey.Jersey;
import cart.movie.Movie;

import cart.poster.Poster;
import cart.shoes.Shoes;
import cart.backup.Service;
/*
 * This is a servlet class that used to show all information of items for administrator.
 * There is another servlet class has the same function. This is used to transfer to page in folder "WEB-INF".
 * In order to consider security, all the pages of managing are in folder "WEB-INF".
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class SearchServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("itemName");
		String type = request.getParameter("itemType");
		Service searchFuzzilyService = new Service();
		if(!type.equals("")){
			switch (type) {
			case "Jersey":
				try {
					type="1";
					List<Jersey> jerseyFList = searchFuzzilyService.searchJerseyFuzzily(name, type);
					request.setAttribute("allJersey", jerseyFList);
					request.getRequestDispatcher("/WEB-INF/manage.jsp").forward(request, response);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
				
			case "Movie":
				try {
					type="2";
					List<Movie> movieFList = searchFuzzilyService.searchMovieFuzzily(name, type);
					request.setAttribute("allMovie", movieFList);
					request.getRequestDispatcher("/WEB-INF/manage.jsp").forward(request, response);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
				
			case "Poster":
				try {
					type="3";
					List<Poster> posterFList = searchFuzzilyService.searchPosterFuzzily(name, type);
					request.setAttribute("allPoster", posterFList);
					request.getRequestDispatcher("/WEB-INF/manage.jsp").forward(request, response);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
				
			case "Shoes":
				try {
					type="4";
					List<Shoes> shoesFList = searchFuzzilyService.searchShoesFuzzily(name, type);
					request.setAttribute("allShoes", shoesFList);
					request.getRequestDispatcher("/WEB-INF/manage.jsp").forward(request, response);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
				
			default:
				break;
			}
		}else{
			Service findAll = new Service();
			List<Jersey> allJersey = null;
			List<Movie> allMovie = null;
			List<Shoes> allShoes = null;
			List<Poster> allPoster = null;
			try {
				allJersey = findAll.searchJerseyFuzzily(name, type);
				allMovie = findAll.searchMovieFuzzily(name, type);
				allShoes = findAll.searchShoesFuzzily(name, type);
				allPoster = findAll.searchPosterFuzzily(name, type);
			} catch (SQLException e) {
				response.getWriter().write("Dial (608)667-6188, please.");
			}
			request.setAttribute("allJersey", allJersey);
			request.setAttribute("allMovie",allMovie);
			request.setAttribute("allShoes",allShoes);
			request.setAttribute("allPoster",allPoster);
			request.getRequestDispatcher("/WEB-INF/manage.jsp").forward(request,response);
			
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}