package cart.admin;

import java.awt.Window;
import java.io.IOException;
import java.io.PrintWriter;
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
 * This is a servlet class that used to add item into system and database. 
 * There are 4 types of item and also use "switch case" to store different types of item.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		switch (type) {
		case "1":
			try {
				String jname = request.getParameter("name");
				String jprice = request.getParameter("price");
				String jimage = "jersey/"+request.getParameter("image");
				int jstock = Integer.parseInt(request.getParameter("stock"));
				String jdesc = request.getParameter("desc");
				Jersey jersey = new Jersey(jname, jprice, jimage, jdesc, type, jstock);
				Service serviceAddJerseyService = new Service();
				serviceAddJerseyService.addJersey(jersey);
				request.getRequestDispatcher("new").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "2":
			try {
				String mname = request.getParameter("name");
				String mprice = request.getParameter("price");
				String mimage = "movie/"+request.getParameter("image");
				int mstock = Integer.parseInt(request.getParameter("stock"));
				String mdesc = request.getParameter("desc");
				Movie movie = new Movie(mname, mprice, mimage, mdesc, type, mstock);
				Service serviceAddMovieService = new Service();
				serviceAddMovieService.addMovie(movie);
				request.getRequestDispatcher("new").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "3":
			try {
				String pname = request.getParameter("name");
				String pprice = request.getParameter("price");
				String pimage = "poster/"+request.getParameter("image");
				int pstock = Integer.parseInt(request.getParameter("stock"));
				String pdesc = request.getParameter("desc");
				Poster poster = new Poster(pname, pprice, pimage, pdesc, type, pstock);
				Service serviceAddPoster = new Service();
				serviceAddPoster.addPoster(poster);
				request.getRequestDispatcher("new").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "4":
			try {
				String sname = request.getParameter("name");
				String sprice = request.getParameter("price");
				String simage = "shoes/"+request.getParameter("image");
				String sdesc = request.getParameter("desc");
				int sstock = Integer.parseInt(request.getParameter("stock"));
				Shoes shoes = new Shoes(sname, sprice, simage, sdesc, type, sstock);
				Service serviceAddShoes = new Service();
				serviceAddShoes.addShoes(shoes);
				request.getRequestDispatcher("new").forward(request, response);
			} catch (Exception e) {
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