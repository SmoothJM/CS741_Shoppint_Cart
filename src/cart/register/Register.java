package cart.register;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.enterprise.inject.New;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import cart.database.DataSourceUtils;
import cart.person.User;
import cart.md5.*;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
import sun.misc.BASE64Encoder;
/*
 * This is the servlet class to register guest to be register customer into the system.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */

public class Register extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String[]> properties = request.getParameterMap();
		User user = new User();
		boolean flag = false;
		
		try {
			QueryRunner qr = new QueryRunner(DataSourceUtils.getBasicDataSource());
			String selectUsername = "select username from customer";
			List<String> listUsername = qr.query(selectUsername, new ColumnListHandler<String>("username"));
			String postUsername = request.getParameter("username");
			for(String s : listUsername){
				if(s.equals(postUsername)){
					flag=true;
					break;
				}
			}
			if(flag){
				request.setAttribute("registerInfo", "This username has been used!");
				request.getRequestDispatcher("/register.jsp").forward(request, response);
			}else{
				BeanUtils.populate(user, properties);
				regist(user);
				response.sendRedirect(request.getContextPath()+"/login.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}


	public void regist(User user) throws SQLException, NoSuchAlgorithmException, UnsupportedEncodingException{
		QueryRunner qr = new QueryRunner(DataSourceUtils.getBasicDataSource());
		MD5 md = new MD5();
		String pwd = "";
		pwd = md.EncoderByMd5(user.getPassword());
		String sql = "insert into customer (username,password,firstname,lastname,email,tel) values(?,?,?,?,?,?)";
		qr.update(sql,user.getUsername(),pwd,user.getFirstname(),user.getLastname(),
				user.getEmail(),user.getTel());
	}
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}