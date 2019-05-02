package cart.login;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import cart.database.DataSourceUtils;
import cart.backup.Service;
import cart.md5.MD5;
import cart.person.User;
/*
 * This is a servlet class used to log into customer channel.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class Login extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MD5 md = new MD5();
		String username = request.getParameter("username");
		String password = "";
		String auto = request.getParameter("auto");
		System.out.println(auto);
		try {
			password = md.EncoderByMd5(request.getParameter("password"));
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String checkCodeClient = request.getParameter("checkcode");
		User userLogin = null;
		HttpSession session = request.getSession();
		String checkCodeSession = (String)session.getAttribute("checkcode_session");
		Service userLoginService = new Service();
		if(!checkCodeClient.equals(checkCodeSession)&&!checkCodeClient.equals(null)){
			request.setAttribute("loginInfo", "Verification code is wrong!");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}
		try {
			userLogin = userLoginService.userLogin(username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(userLogin!=null){
			if ("on".equals(auto)) {
				Cookie cookie = new Cookie("auto", username);
				cookie.setMaxAge(60*60*24*7);
				cookie.setPath("/CS741");
				response.addCookie(cookie);
			}
			session.setAttribute("username", username);
			session.setAttribute("user", userLogin);
			response.sendRedirect(request.getContextPath()+"/index.jsp");
		}else{
			request.setAttribute("loginInfo", "Username or password error! Check your account, please.");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
	}
	
/*	public User login(String username,String password) throws SQLException{
		QueryRunner runner = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sql = "select * from customer where username=? and password=?";
		User user = runner.query(sql, new BeanHandler<User>(User.class),username,password);
		return user;
	}*/

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}