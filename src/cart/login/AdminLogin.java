package cart.login;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cart.backup.Service;
import cart.jersey.Jersey;
import cart.md5.MD5;
import cart.movie.Movie;
import cart.person.Admin;
import cart.person.User;
import cart.poster.Poster;
import cart.shoes.Shoes;
/*
 * This is a servlet class used to log into the admin channel and display all items info.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class AdminLogin extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MD5 md = new MD5();
		String username_admin = request.getParameter("username_admin");
		String password_admin="";
		try {
			password_admin = md.EncoderByMd5(request.getParameter("password_admin"));
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Admin adminLogin = null;
		HttpSession session = request.getSession();
		Service serviceAdminLogin = new Service();
		try {
			adminLogin = serviceAdminLogin.adminLogin(username_admin,password_admin);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(adminLogin!=null){
			session.setAttribute("username_admin", username_admin);
			//response.sendRedirect(request.getContextPath()+"/WEB-INF/manage.jsp");
			
			Service findAll = new Service();
			List<Jersey> allJersey = null;
			List<Movie> allMovie = null;
			List<Shoes> allShoes = null;
			List<Poster> allPoster = null;
			try {
				allJersey = findAll.findJersey();
				allMovie = findAll.findMovie();
				allShoes = findAll.findShoes();
				allPoster = findAll.findPoster();
			} catch (SQLException e) {
				//e.printStackTrace();
				response.getWriter().write("Dial (608)667-6188, please.");
			}
			request.setAttribute("allJersey", allJersey);
			request.setAttribute("allMovie",allMovie);
			request.setAttribute("allShoes",allShoes);
			request.setAttribute("allPoster",allPoster);
			request.getRequestDispatcher("/WEB-INF/manage.jsp").forward(request,response);
		}else{
			request.setAttribute("loginInfo", "Username or password error! Check your account, please.");
			request.getRequestDispatcher("/adminLogin.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}